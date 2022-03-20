//확장for문
//배열의 모든 요소의 합을 구하여 출력
package chap01;

public class J_ArraySumForIn {
	public static void main(String[] args) {
		double a[] = {1.0, 2.0, 3.0, 4.0, 5.0};
		for(int i=0; i<a.length; i++){
			System.out.println("a["+i+"] = "+a[i]);
		}
		double sum = 0; //합계
		for(double i : a ) { //확장for문!! ()안의 콜론:은 ~의 안에 있는 이라는 뜻!
			sum = sum+i;
		}
		/*
		 * 위 확장for문을 기본 for문으로 바꿔쓰면
		 * for(int i=0; i<a.length; i++){
		 * 	 sum = sum + a[i];
		 * }
		 */
	}
}
