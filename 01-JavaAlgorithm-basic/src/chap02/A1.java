//1,2,...,n�� �� ���ϱ� (while��)
package chap02;

import java.util.Scanner;

public class A1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�");
		System.out.print("n�� ��: ");
		int n=scanner.nextInt();
		int sum=0;
		int i=1;
		
		while(i<=n) {
			sum+=i;
			i++;
		}
		System.out.println("1���� "+n+"������ ���� "+sum+"�Դϴ�.");
		scanner.close();
	}
}
