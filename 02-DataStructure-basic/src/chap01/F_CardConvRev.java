//��� ��ȯ
//�Է¹��� 10������ 2����~36������ �����ȯ�Ͽ� ��Ÿ��
//8���� : 0, 1, 2, 3, 4, 5, 6, 7
//10���� : 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
//16���� : 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F
package chap01;

import java.util.Scanner;

public class F_CardConvRev {
	static int cardConvR(int x, int r, char d[]) {
		int digits = 0;
		String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x%r); //r�� ���� �������� ����
			x /= r; //x=x/r //x�� x/r�� ����
			
		}while(x!=0);
			return digits;
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int no;						//��ȯ�ϴ� ����
		int cd;						//���
		int dno;					//��ȯ ���� �ڸ���
		int retry; 					//�ٽ� �ѹ� �Ұǰ���?
		char[] cno=new char[32]; 	//��ȯ �� �� �ڸ��� ���ڸ� �־�δ� ������ �迭
		System.out.println("10������ ��� ��ȯ�ϴ� ���α׷��Դϴ�.");
		
		do{
			do{
				System.out.print("��ȯ�ϴ� ���� �ƴ� ����: ");
				no=scanner.nextInt();
			}while (no < 0);
			do {System.out.print("� ������ ��ȯ�ұ��?");
				cd=scanner.nextInt();
			}while(cd < 2 || cd > 36);
		
			dno = cardConvR(no, cd, cno); //no�� cd������ ��ȯ��Ű��
			
			System.out.println(cd + "�����δ� ");
			for (int i= dno-1; i>=0; i--) { 
				System.out.println(cno[i]);
			}
			System.out.println("�Դϴ�.");
			
			System.out.print("�ѹ� �� �ұ��? (1.�� / 0.�ƴϿ�): ");
			retry = scanner.nextInt();
		}while (retry ==1);
		
		
		scanner.close();
	}
}




















