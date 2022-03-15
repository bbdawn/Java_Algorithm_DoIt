//네 값의 최솟값을 구하는 min4 메서드 작성하세요  
package chap01;

public class A5 {
	static int min4(int a, int b, int c, int d) {
		int min=a;
		if(b<min)
			min=b;
		if(c<min)
			min=c;
		if(d<min)
			min=d;
		return min;//구한 최댓값을 호출한 곳으로 반환하는 역할 
	}
	
	public static void main(String[] args) {
		System.out.println("min4(3,1,5,9) = " + min4(3,1,5,9));

	}

}
