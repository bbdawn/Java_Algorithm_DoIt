//n단의 숫자 피라미드 출력하는 메서드 작성하세요
package chap02;

import java.util.Scanner;

public class E3 {
	public static void nspira(int n) {
		for (int i = 1; i <= n; i++) { 
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");		
			}
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
				System.out.print(i%10);	//i행에 출력하는 숫자			
			} 										
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.print("몇 단의 피라미드를 출력할까요: ");
		n = scanner.nextInt();
		nspira(n);
		scanner.close();
	}
}
