//세 값의 최솟값을 구하는 min3 메서드 작성하세요
package chap01;

public class A4 {

	static int min3(int a, int b, int c) {
		int min=a;
		if(b>min)
			min=b;
		if(c>min)
			min=c;
		return min;//구한 최댓값을 호출한 곳으로 반환하는 역할 
	}
	
	public static void main(String[] args) {
		System.out.println("min3(3,5,9) = " + min3(3,5,9));

	}

}
