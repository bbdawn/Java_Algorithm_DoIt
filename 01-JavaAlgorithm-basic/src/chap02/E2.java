//n���� �Ƕ�̵� ����ϴ� �޼��� �ۼ��ϼ���
package chap02;

import java.util.Scanner;

public class E2 {
	public static void triangleLB(int n) {
		for (int i = 1; i <= n; i++) { // �Է� ���� n�� ����ŭ �ݺ�
			for (int j = 1; j <= n - i; j++) {// n�� ����ŭ �ϳ��� ������ ����ϴµ� -1 �� �־� �ϳ��� �پ���� �Ƕ�̵� ����
				System.out.print(" ");		//n=5�� ��� 4 3 2 1 �� ������ ���ʺ��� ����
			}
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) {// j�� i�� �Ѵ� 1���� ����
				System.out.print("*");					// 1 <= (1 -1) *2 + 1 = 1 �̹Ƿ� 1���� ������ ����ݴϴ�
			} 											// �ι�° �ݺ��� 2 <= (2 -1)*2 +1 = 3 �̹Ƿ� 3���� ���� �����ϴ�.
			System.out.println(" ");// �ٹٲ�
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.print("�� ���� �Ƕ�̵带 ����ұ��: ");
		n = scanner.nextInt();
		triangleLB(n);
		scanner.close();
	}
}


/*
	���� �˰� �� ��
	for{
		for{}
		for{}
	}
	
	�� ������ ó�� ����غô�!! 
*/