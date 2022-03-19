//배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램 작성
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









