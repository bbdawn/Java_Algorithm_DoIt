//�迭 ��Ҹ� �������� �����ϴ� ������ �ϳ��ϳ� ��Ÿ���� ���α׷� �ۼ�
package chap01;

public class D3_Array_SumOf {
	static int sumOf(int a[]) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int a[]= {5, 10, 73, 2, -5, 42};
		System.out.println(sumOf(a));
	}
}









