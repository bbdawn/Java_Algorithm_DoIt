//�Ҽ��� ����
//1,000 ������ �Ҽ��� �����ϱ�(ver1) 
//2���� n-1���� � �����ε� ����������� ����
//����������� ������ �ϳ� �̻� �����ϸ� �� ���� �ռ���(composition number)
package chap01;

public class G_PrimeNumber1 {
	public static void main(String[] args) {
		int counter = 0; //�������� Ƚ��
		int i;
		for(int n=2; n<=1000; n++) { //n : �������� �� (�Ҽ��� �� ���ɼ��� �ִ� ��)
			for(i=2; i<n; i++) { 	//i : ������ ��
				counter++;
				if(n%i == 0) { //���������� �Ҽ��� �ƴ� -> ���̻� �ݺ� �ʿ������ break
					break;
				}//if
			}//for
			if(n==i) { //���������� ����������� ����
				System.out.println(n);
			}//if
		}//for
		System.out.println("�������� ������ Ƚ�� : "+counter);
	}//main
}
