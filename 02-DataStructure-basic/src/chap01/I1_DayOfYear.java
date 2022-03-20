//2���� �迭 Ȱ���ؼ�
//�� �� ��� �� ���� ���ϴ� ���α׷� �ۼ��ϱ� (�� �� ����°����~)
//System.out.printf ����
/*
 * 4�� 15�� -> 1���� �� �� + 2���� �� �� + 3���� �� �� + 15
 * m�� d�� -> 1��, 2��, ..., m-1���� �� ���� �� + d
 * ------
 * 2���� �ϼ� : ����� 28��, ������ 29��
 * -> 2������� mdays�� �� ���� �� �� �����ϱ� 
 */
package chap01;

import java.util.Scanner;

public class I1_DayOfYear {
	//�� ���� �ϼ� ����
	static int [][]mdays = { 
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },//���
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }//����
			
	};
	
	//���� year�� �����̸� 1, ����̸� 0
	static int isLeap(int year) {
		return (year%4==0 && year%100 != 0 || year%400==0)?1:0;
	}
	
	//���� y�� m�� d���� �� �� ��� �� ���� ����
	static int dayOfYear(int y, int m, int d) {
		int days = d;
		for(int i=1; i<m; i++) {//1��~(m-1)���� �� ���� ����
			days = days + mdays[isLeap(y)][i-1]; //isLeap(y)�κ� -> �����̸� 1, ����̸� 0
		}
		return days;
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int retry;
		System.out.println("�� �� ��� �ϼ��� ���ϴ� ���α׷��Դϴ�.");
		do {
			System.out.print("��: "); int year = scanner.nextInt();//��
			System.out.print("��: "); int month = scanner.nextInt();//��
			System.out.print("��: "); int day = scanner.nextInt();//��
			
			System.out.printf("�� �� %d��°�Դϴ�\n", dayOfYear(year, month, day));
			
			System.out.print("�� �� �� �ұ��?(1.��, 2.�ƴϿ�): ");
			retry=scanner.nextInt();
		}while(retry==1);
		scanner.close();
	}
}



























