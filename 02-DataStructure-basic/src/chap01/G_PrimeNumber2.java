//�Ҽ� �����ϱ� ver2. �˰��� ����
//for(int n=5; n<=1000; n = n+2) -> ����� Ȧ���� ( �ǳʶ�� ����!)
package chap01;

public class G_PrimeNumber2 {
	public static void main(String[] args) {
		int counter = 0;			//������ �������� Ƚ��
		int ptr = 0;				//ã�� �Ҽ��� ����
		int prime[] = new int[500];	//�Ҽ��� �����ϴ� �迭
		
		prime[ptr++]=2;
		prime[ptr++]=3;
		
		for(int n=5; n<=1000; n = n+2) {//����� Ȧ���� 
			boolean flag = false;
			for(int i=1; prime[i] * prime[i] <= n; i++) {
				counter +=2;
				if(n % prime[i] == 0) { //����������� �Ҽ��� �ƴ�!
					flag = true;
					break;				//���̻��� �ݺ��� ���ʿ���
				}//if
			}//for
			if(!flag) {
				prime[ptr++] = n;
				counter++;
			}//if
		}//for
		
		for(int i=0; i<ptr; i++) {
			System.out.println(prime[i]);
		}
		System.out.println("������ �������� ������ Ƚ�� : "+counter);
	}//main
}
