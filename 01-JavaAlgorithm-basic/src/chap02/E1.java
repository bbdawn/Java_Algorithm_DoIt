//왼쪽 아래가 직각인 이등변 삼각형 출력하기
package chap02;

public class E1 {
	public static void main(String[] args) {
		for(int i=1;i<5;i++) { //i는 1->2->3->4
			for(int j=1; j<=i; j++) //j는 1->2->...->i번 반복하고 i로 돌아가기
				System.out.print("*");
				System.out.println(" ");
		}
	}
}
