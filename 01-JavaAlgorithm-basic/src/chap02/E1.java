//���� �Ʒ��� ������ �̵ �ﰢ�� ����ϱ�
package chap02;

public class E1 {
	public static void main(String[] args) {
		for(int i=1;i<5;i++) { //i�� 1->2->3->4
			for(int j=1; j<=i; j++) //j�� 1->2->...->i�� �ݺ��ϰ� i�� ���ư���
				System.out.print("*");
				System.out.println(" ");
		}
	}
}
