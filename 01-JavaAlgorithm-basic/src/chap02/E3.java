//n���� ���� �Ƕ�̵� ����ϴ� �޼��� �ۼ��ϼ���
package chap02;

import java.util.Scanner;

public class E3 {
	public static void nspira(int n) {
		for (int i = 1; i <= n; i++) { 
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");		
			}
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
				System.out.print(i%10);	//i�࿡ ����ϴ� ����			
			} 										
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.print("�� ���� �Ƕ�̵带 ����ұ��: ");
		n = scanner.nextInt();
		nspira(n);
		scanner.close();
	}
}
