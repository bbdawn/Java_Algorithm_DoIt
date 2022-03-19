//키보드 입력값을 2자리의 양수(10~99)로 제한하기 (드모르간 법칙)
package chap02;

import java.util.Scanner;

public class C1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int no;
		
		System.out.println("2자리의 정수를 입력하세요");
		
		do {
			System.out.print("입력: ");
			no=scanner.nextInt();
		}while
			(no<10||no>99);//이부분이 포인트!!
			
		
		System.out.println("변수 no의 값은 "+no+"입니다");
		scanner.close();
	
	}
}

/*
	드모르간 법칙
		!(a >=10 && no <= 99)
		각 조건을 부정하고 논리곱을 논리합으로, 논리 합을 논리 곱으로 바꾸고 다시 전체를 부정하면 원래의 조건과 같다
		1. x && y 와 !(!x || !y)는 같습니다
		2. x || y 와 !(!x && !y)는 같습니다
*/