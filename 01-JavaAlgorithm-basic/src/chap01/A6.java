//3���� �������� �Է��ϰ� �߾Ӱ��� ���� ���� ���
package chap01;

import java.util.Scanner;

public class A6 {
		static int med3(int a, int b, int c) {
			if(a>=b)//a�� b���� ũ�ų� ���� ��
				if(b>=c)	//a>=b>=c
					return b;
				else if(a<=c)//c>=a>=b
					return a;
				else 		//a>=c>=b
					return c;
			else if(a > c)
				return a;
			else if(b > c) 
				return c;
			else 
				return b;
		}//med3
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("�� ������ �߾Ӱ��� ���մϴ�");
		
		System.out.print("a�� ��: ");
		int a = scanner.nextInt();
		System.out.print("b�� ��: ");
		int b = scanner.nextInt();
		System.out.print("c�� ��: ");
		int c = scanner.nextInt();
		
		System.out.println("�߾Ӱ��� "+ med3(a,b,c) +"�Դϴ�");
		scanner.close();
	}
	
	
	
	
	
	
	
	
	
	

}
