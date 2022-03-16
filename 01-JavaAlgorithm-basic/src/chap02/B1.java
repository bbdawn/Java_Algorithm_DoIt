//1,2,...,n의 합 구하기 + 양수만 입력 가능하게하기 (do-while)
package chap02;

import java.util.Scanner;

public class B1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n;
		System.out.println("1부터 n까지의 합을 구합니다");
		
		do {
			System.out.println("n의 값: ");
			n = scanner.nextInt();
		}while(n<=0); //**n이 0보다 클 때까지 반복하기**
		
		int sum=0;
		for(int i=1; i<=n; i++)
			sum+=i;
		
		System.out.println("1부터 "+ n +"까지의 합은 "+ sum+"입니다");
		scanner.close();
		
		
	}
}
