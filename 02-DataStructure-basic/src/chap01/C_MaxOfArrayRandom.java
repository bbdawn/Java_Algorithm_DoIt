//������ ����� �迭�� ��ڰ� �����ϱ� 
//�迭�� ��ҿ� ���� �ϳ��� �Է��ϴ� ���� ������ ��쿡 �� ��ҿ� ������ ������ �� �ִ�
package chap01;

import java.util.Random;
import java.util.Scanner;

public class C_MaxOfArrayRandom {
	static int maxOf(int[] a) {
		int max= a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}//if
		}//for
		return max;
	}//maxOf
	public static void main(String[] args) {
		Random random=new Random();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Ű�� �ִ��� ���ϴ� ���α׷��Դϴ�.");
		System.out.print("��� �� : ");
		int num = scanner.nextInt();
		
		int height[] = new int[num];
		
		System.out.println("Ű ���� �Ʒ��� �����ϴ�");
		for(int i=0; i<num; i++) {
			height[i] = 100 + random.nextInt(90);
			System.out.println("height["+i+"] = "+height[i]);
		}
		
		System.out.println("�ִ��� "+maxOf(height)+"�Դϴ�");
		
		scanner.close();
	}//main
}
