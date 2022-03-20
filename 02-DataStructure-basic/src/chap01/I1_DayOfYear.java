//2차원 배열 활용해서
//그 해 경과 일 수를 구하는 프로그램 작성하기 (그 해 몇일째인지~)
//System.out.printf 사용법
/*
 * 4월 15일 -> 1월의 일 수 + 2월의 일 수 + 3월의 일 수 + 15
 * m월 d일 -> 1월, 2월, ..., m-1월의 일 수의 합 + d
 * ------
 * 2월의 일수 : 평년은 28일, 윤년은 29일
 * -> 2차원배월 mdays에 각 달의 일 수 저장하기 
 */
package chap01;

import java.util.Scanner;

public class I1_DayOfYear {
	//각 달의 일수 저장
	static int [][]mdays = { 
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },//평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }//윤년
			
	};
	
	//서기 year이 윤년이면 1, 평년이면 0
	static int isLeap(int year) {
		return (year%4==0 && year%100 != 0 || year%400==0)?1:0;
	}
	
	//서기 y년 m월 d일의 그 해 경과 일 수를 구함
	static int dayOfYear(int y, int m, int d) {
		int days = d;
		for(int i=1; i<m; i++) {//1월~(m-1)월의 일 수를 더함
			days = days + mdays[isLeap(y)][i-1]; //isLeap(y)부분 -> 윤년이면 1, 평년이면 0
		}
		return days;
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int retry;
		System.out.println("그 해 경과 일수를 구하는 프로그램입니다.");
		do {
			System.out.print("년: "); int year = scanner.nextInt();//년
			System.out.print("월: "); int month = scanner.nextInt();//월
			System.out.print("일: "); int day = scanner.nextInt();//일
			
			System.out.printf("그 해 %d일째입니다\n", dayOfYear(year, month, day));
			
			System.out.print("한 번 더 할까요?(1.예, 2.아니오): ");
			retry=scanner.nextInt();
		}while(retry==1);
		scanner.close();
	}
}



























