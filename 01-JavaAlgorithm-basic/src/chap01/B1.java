//�Է��� �������� ������� �������� 0���� �Ǵ�
package chap01;

import java.util.Scanner;

public class B1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("������ �Է��ϼ���: ");
		int n = scanner.nextInt();

		if(n>0) {
			System.out.println("�� ���� ����Դϴ�");
		}else if(n<0) {
			System.out.println("�� ���� �����Դϴ�");
		}else {
			System.out.println("�� ���� 0�Դϴ�");
		}
		
		scanner.close();
	}

}
