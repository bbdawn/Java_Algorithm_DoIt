//배열 복제(.clone 클론메서드 호출) 
package chap01;

public class B_CloneArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = a.clone();
		
		b[3] = 0; //b[3]이 4에서 0으로 변경됨
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
		
		System.out.println(" ");
		for(int i=0; i<a.length; i++) {
			System.out.println("b["+i+"] = "+b[i]);
		}
	}
}
