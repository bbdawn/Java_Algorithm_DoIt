//�� ���� �ּڰ��� ���ϴ� min3 �޼��� �ۼ��ϼ���
package chap01;

public class A4 {

	static int min3(int a, int b, int c) {
		int min=a;
		if(b>min)
			min=b;
		if(c>min)
			min=c;
		return min;//���� �ִ��� ȣ���� ������ ��ȯ�ϴ� ���� 
	}
	
	public static void main(String[] args) {
		System.out.println("min3(3,5,9) = " + min3(3,5,9));

	}

}
