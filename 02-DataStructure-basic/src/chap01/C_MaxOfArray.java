//�迭 ����� �ִ� ���ϱ� (�Է¹��� Ű�� �ִ��� ���մϴ�)
package chap01;

import java.util.Scanner;

public class C_MaxOfArray {
	static int maxOf(int[] a) { // ***
		int max = a[0]; //ó�� ��Ҹ� �ִ����� ����
		for (int i = 1; i < a.length; i++)
			if (a[i] > max)
				max = a[i];

		return max;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�Է¹��� Ű�� �ִ��� ���մϴ�");
		System.out.print("��� �� : ");
		int num = scanner.nextInt();// �迭�� ��ڼ� �Է¹ޱ�
		int height[] = new int[num];// �迭�� ��ڼ��� num�� �迭�� ����

		for (int i = 0; i < num; i++) {
			System.out.print("height[" + i + "] = ");
			height[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println("�ִ��� " + maxOf(height) + "�Դϴ�.");
		
	}
}
