//기수 변환
//입력받은 10진수를 2진수~36진수로 기수변환하여 나타냄
//8진수 : 0, 1, 2, 3, 4, 5, 6, 7
//10진수 : 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
//16진수 : 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F
package chap01;

import java.util.Scanner;

public class F_CardConvRev {
	static int cardConvR(int x, int r, char d[]) {
		int digits = 0;
		String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x%r); //r로 나눈 나머지를 저장
			x /= r; //x=x/r //x에 x/r을 저장
			
		}while(x!=0);
			return digits;
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int no;						//변환하는 정수
		int cd;						//기수
		int dno;					//변환 후의 자릿수
		int retry; 					//다시 한번 할건가요?
		char[] cno=new char[32]; 	//변환 후 각 자리에 숫자를 넣어두는 문자의 배열
		System.out.println("10진수를 기수 변환하는 프로그램입니다.");
		
		do{
			do{
				System.out.print("변환하는 음이 아닌 정수: ");
				no=scanner.nextInt();
			}while (no < 0);
			do {System.out.print("어떤 진수로 변환할까요?");
				cd=scanner.nextInt();
			}while(cd < 2 || cd > 36);
		
			dno = cardConvR(no, cd, cno); //no를 cd진수로 변환시키기
			
			System.out.println(cd + "진수로는 ");
			for (int i= dno-1; i>=0; i--) { 
				System.out.println(cno[i]);
			}
			System.out.println("입니다.");
			
			System.out.print("한번 더 할까요? (1.예 / 0.아니오): ");
			retry = scanner.nextInt();
		}while (retry ==1);
		
		
		scanner.close();
	}
}




















