//�迭 ��Ҹ� �������� �����ϴ� ������ �ϳ��ϳ� ��Ÿ���� ���α׷� �ۼ�
package chap01;

public class D2_ReverseArray_process {
	static void swap(int a[], int idx1, int idx2) {
		int t = a[idx1]; 
		a[idx1]=a[idx2]; 
		a[idx2]=t;
		System.out.println("a["+ idx1 +"]�� a["+ idx2 +"]�� ��ȯ�մϴ�");
		for(int j=0; j<a.length; j++) {
			System.out.print(a[j]+ " ");
		}
		System.out.println(" ");
	}
	static void reverse(int a[]) {
		for(int i=0; i<a.length/2; i++) {
			swap(a, i, a.length-i-1);
			
			
		}
	}
	public static void main(String[] args) {
		int x[]= {5, 10, 73, 2, -5, 42};
		for(int k=0; k<x.length; k++) {
			System.out.print(x[k]+" ");
		}
		System.out.println(" ");
		reverse(x); //�迭 a�� ��Ҹ� �������� ���� 
		System.out.print("���� ������ ���ƽ��ϴ�.");
	}
}









