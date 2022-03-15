//3개의 정숫값을 입력하고 중앙값을 구한 다음 출력
package chap01;

import java.util.Scanner;

public class A6 {
		static int med3(int a, int b, int c) {
			if(a>=b)//a가 b보다 크거나 같을 때
				if(b>=c)	//a>=b>=c
					return b;
				else if(a<=c)//c>=a>=b
					return a;
				else 		//a>=c>=b
					return c;
			else if(a > c)
				return a;
			else if(b > c) 
				return c;
			else 
				return b;
		}//med3
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("세 정수의 중앙값을 구합니다");
		
		System.out.print("a의 값: ");
		int a = scanner.nextInt();
		System.out.print("b의 값: ");
		int b = scanner.nextInt();
		System.out.print("c의 값: ");
		int c = scanner.nextInt();
		
		System.out.println("중앙값은 "+ med3(a,b,c) +"입니다");
		scanner.close();
	}
	
	
	
	
	
	
	
	
	
	

}
