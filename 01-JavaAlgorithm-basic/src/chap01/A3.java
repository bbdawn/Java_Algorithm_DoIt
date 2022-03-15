//네 값의 최댓값을 구하는 max4 메서드 작성하세요
package chap01;

public class A3 {

	static int max4(int a, int b, int c, int d) {
		int max=a;
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		if(d>max)
			max=d;
		return max;//구한 최댓값을 호출한 곳으로 반환하는 역할 
	}
	public static void main(String[] args) {
		System.out.println("max4(3,1,5,9) = " + max4(3,1,5,9));

	}

}
