//�� ���� �ּڰ��� ���ϴ� min4 �޼��� �ۼ��ϼ���  
package chap01;

public class A5 {
	static int min4(int a, int b, int c, int d) {
		int min=a;
		if(b<min)
			min=b;
		if(c<min)
			min=c;
		if(d<min)
			min=d;
		return min;//���� �ִ��� ȣ���� ������ ��ȯ�ϴ� ���� 
	}
	
	public static void main(String[] args) {
		System.out.println("min4(3,1,5,9) = " + min4(3,1,5,9));

	}

}
