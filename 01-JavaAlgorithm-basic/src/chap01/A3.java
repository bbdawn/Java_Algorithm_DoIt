//�� ���� �ִ��� ���ϴ� max4 �޼��� �ۼ��ϼ���
package chap01;

public class A3 {

	static int max4(int a, int b, int c, int d) {
		int max=a;
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		if(d>max)
			max=d;
		return max;//���� �ִ��� ȣ���� ������ ��ȯ�ϴ� ���� 
	}
	public static void main(String[] args) {
		System.out.println("max4(3,1,5,9) = " + max4(3,1,5,9));

	}

}
