//Ű���� �Է°��� 2�ڸ��� ���(10~99)�� �����ϱ� (��𸣰� ��Ģ)
package chap02;

import java.util.Scanner;

public class C1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int no;
		
		System.out.println("2�ڸ��� ������ �Է��ϼ���");
		
		do {
			System.out.print("�Է�: ");
			no=scanner.nextInt();
		}while
			(no<10||no>99);//�̺κ��� ����Ʈ!!
			
		
		System.out.println("���� no�� ���� "+no+"�Դϴ�");
		scanner.close();
	
	}
}

/*
	��𸣰� ��Ģ
		!(a >=10 && no <= 99)
		�� ������ �����ϰ� ������ ��������, �� ���� �� ������ �ٲٰ� �ٽ� ��ü�� �����ϸ� ������ ���ǰ� ����
		1. x && y �� !(!x || !y)�� �����ϴ�
		2. x || y �� !(!x && !y)�� �����ϴ�
*/