//3���� ������ ��� �ִ��� ���Ͽ� ����ϱ�
package chap01;

public class A2 {
	static int max3(int a, int b, int c) {
		int max = a;
		if(b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
		}
			
		return max; //���� �ִ��� ȣ���� ������ ��ȯ��Ű��
	}//max3
	
	public static void main(String[] args) {
		System.out.println("max3(3,2,1)=" +max3(3,2,1));//3>2>1 //3
		System.out.println("max3(2,1,1)=" +max3(2,1,1));//2>1=1 //2
		System.out.println("max3(3,5,7)=" +max3(3,5,7));//3<5<7 //7
	}//main
}


