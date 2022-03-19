//두 배열이 같은가를 판단하는 메서드
package chap01;

import java.util.Scanner;

public class E_ArrayEqual {
	static boolean equals(int a[], int b[]) {
		if(a.length != b.length) {
			return false;
		}
		for(int i=0; i<a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}
		return true; //여기까지 왔으면 모든 요소가 같은 것임. true 반환하기
	}//equals
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("배열 a의 요솟수: ");
		int na = scanner.nextInt();
		int a[]=new int[na];//요솟수가 na인 배열 생성
		
		for(int i=0; i<na; i++) {
			System.out.print("a["+i+"] : ");
			a[i]=scanner.nextInt();
		}
		
		System.out.println("배열 b의 요솟수 : ");
		int nb = scanner.nextInt();
		int b[]=new int[nb];//요솟수가 na인 배열 생성
		
		for(int i=0; i<nb; i++) {
			System.out.print("b["+i+"] : ");
			b[i]=scanner.nextInt();
		}
		
		System.out.println("배열 a와 배열 b는 "+ (equals(a,b) ? "같습니다." : "같지 않습니다."));
		scanner.close();
	}
}
