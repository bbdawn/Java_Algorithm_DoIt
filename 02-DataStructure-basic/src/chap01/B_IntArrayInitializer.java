//변수의 요솟값을 초기화하며 배열 선언하기
package chap01;

public class B_IntArrayInitializer {
	public static void main(String[] args) {
		int[] a= {1, 2, 3, 4, 5};
		
		for(int i=0; i<a.length; i++) {
			System.out.println("int a["+i+"]="+a[i]);
		}
	}
}
