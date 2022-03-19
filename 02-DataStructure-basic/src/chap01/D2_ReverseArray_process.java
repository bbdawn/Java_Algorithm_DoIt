//배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램 작성
package chap01;

public class D2_ReverseArray_process {
	static void swap(int a[], int idx1, int idx2) {
		int t = a[idx1]; 
		a[idx1]=a[idx2]; 
		a[idx2]=t;
		System.out.println("a["+ idx1 +"]과 a["+ idx2 +"]를 교환합니다");
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
		reverse(x); //배열 a의 요소를 역순으로 정렬 
		System.out.print("역순 정렬을 마쳤습니다.");
	}
}









