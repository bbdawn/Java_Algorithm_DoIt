//�迭�� ��ҿ� ���� �о� �鿩 �������� �����մϴ�
package chap01;

import java.util.Scanner;

public class D1_ReverseArray {
	static void swap(int a[], int idx1, int idx2) {
		int t = a[idx1]; a[idx1]=a[idx2]; a[idx2]=t;
	}
	static void reverse(int a[]) {
		for(int i=0; i<a.length/2; i++) {
			swap(a, i, a.length-i-1);
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("�迭�� ��ڼ�: ");
		int num=scanner.nextInt();
		int x[]=new int[num]; //��ڼ��� num�� �迭
		
		for(int i=0; i<num; i++) {
			System.out.println("x["+i+"] = ");
			x[i]= scanner.nextInt();
		}
		
		reverse(x); //�迭 a�� ��Ҹ� �������� ���� 
		
		System.out.println("��Ҹ� �������� �����߽��ϴ�.");
		for(int i=0; i<num; i++) {
			System.out.println("x["+i+"] = "+x[i]);
		}
		scanner.close();
	}
}









