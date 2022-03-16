//1,2,...,n의 합 구하기 (for문)
package chap02;

import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값: ");
		int n=scanner.nextInt();
		
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		
		System.out.println("1부터 "+"까지의 합은 "+sum+"입니다.");
		
		
		
		scanner.close();
	}
}
