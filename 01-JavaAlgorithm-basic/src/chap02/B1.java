//1,2,...,n�� �� ���ϱ� + ����� �Է� �����ϰ��ϱ� (do-while)
package chap02;

import java.util.Scanner;

public class B1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n;
		System.out.println("1���� n������ ���� ���մϴ�");
		
		do {
			System.out.println("n�� ��: ");
			n = scanner.nextInt();
		}while(n<=0); //**n�� 0���� Ŭ ������ �ݺ��ϱ�**
		
		int sum=0;
		for(int i=1; i<=n; i++)
			sum+=i;
		
		System.out.println("1���� "+ n +"������ ���� "+ sum+"�Դϴ�");
		scanner.close();
		
		
	}
}
