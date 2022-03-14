//3개의 정수값 가운데 최댓값을 구하여 출력하기
package chap01;

public class A2 {
	static int max3(int a, int b, int c) {
		int max = a;
		if(b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
		}
			
		return max; //구한 최댓값을 호출한 곳으로 반환시키기
	}//max3
	
	public static void main(String[] args) {
		System.out.println("max3(3,2,1)=" +max3(3,2,1));//3>2>1 //3
		System.out.println("max3(2,1,1)=" +max3(2,1,1));//2>1=1 //2
		System.out.println("max3(3,5,7)=" +max3(3,5,7));//3<5<7 //7
	}//main
}


