//Ȯ��for��
//�迭�� ��� ����� ���� ���Ͽ� ���
package chap01;

public class J_ArraySumForIn {
	public static void main(String[] args) {
		double a[] = {1.0, 2.0, 3.0, 4.0, 5.0};
		for(int i=0; i<a.length; i++){
			System.out.println("a["+i+"] = "+a[i]);
		}
		double sum = 0; //�հ�
		for(double i : a ) { //Ȯ��for��!! ()���� �ݷ�:�� ~�� �ȿ� �ִ� �̶�� ��!
			sum = sum+i;
		}
		/*
		 * �� Ȯ��for���� �⺻ for������ �ٲ㾲��
		 * for(int i=0; i<a.length; i++){
		 * 	 sum = sum + a[i];
		 * }
		 */
	}
}
