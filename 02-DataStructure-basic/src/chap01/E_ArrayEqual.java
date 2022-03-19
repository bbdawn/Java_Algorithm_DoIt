//�� �迭�� �������� �Ǵ��ϴ� �޼���
package chap01;

import java.util.Scanner;

public class E_ArrayEqual {
	static boolean equals(int a[], int b[]) {
		if(a.length != b.length) {
			return false;
		}
		for(int i=0; i<a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		return true; //������� ������ ��� ��Ұ� ���� ����. true ��ȯ�ϱ�
	}//equals
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("�迭 a�� ��ڼ�: ");
		int na = scanner.nextInt();
		int a[]=new int[na];//��ڼ��� na�� �迭 ����
		
		for(int i=0; i<na; i++) {
			System.out.print("a["+i+"] : ");
			a[i]=scanner.nextInt();
		}
		
		System.out.println("�迭 b�� ��ڼ� : ");
		int nb = scanner.nextInt();
		int b[]=new int[nb];//��ڼ��� na�� �迭 ����
		
		for(int i=0; i<nb; i++) {
			System.out.print("b["+i+"] : ");
			b[i]=scanner.nextInt();
		}
		
		System.out.println("�迭 a�� �迭 b�� "+ (equals(a,b) ? "�����ϴ�." : "���� �ʽ��ϴ�."));
		scanner.close();
	}
}
