//�迭 ����(.clone Ŭ�и޼��� ȣ��) 
package chap01;

public class B_CloneArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = a.clone();
		
		b[3] = 0; //b[3]�� 4���� 0���� �����
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
		
		System.out.println(" ");
		for(int i=0; i<a.length; i++) {
			System.out.println("b["+i+"] = "+b[i]);
		}
	}
}
