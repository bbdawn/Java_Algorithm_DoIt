//1,2,...,n�� �� ���ϱ� (for��)
package chap02;

import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� ��: ");
		int n=scanner.nextInt();
		
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		
		System.out.println("1���� "+"������ ���� "+sum+"�Դϴ�.");
		
		
		
		scanner.close();
	}
}
