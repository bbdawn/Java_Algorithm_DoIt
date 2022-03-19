//n단의 피라미드 출력하는 메서드 작성하세요
package chap02;

import java.util.Scanner;

public class E2 {
	public static void triangleLB(int n) {
		for (int i = 1; i <= n; i++) { // 입력 받은 n의 값만큼 반복
			for (int j = 1; j <= n - i; j++) {// n의 값만큼 하나의 공백을 출력하는데 -1 을 넣어 하나씩 줄어나가는 피라미드 구조
				System.out.print(" ");		//n=5일 경우 4 3 2 1 의 공간을 왼쪽부터 생성
			}
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) {// j와 i는 둘다 1부터 시작
				System.out.print("*");					// 1 <= (1 -1) *2 + 1 = 1 이므로 1개의 별부터 찍어줍니다
			} 											// 두번째 반복시 2 <= (2 -1)*2 +1 = 3 이므로 3개의 별이 찍힙니다.
			System.out.println(" ");// 줄바꿈
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.print("몇 단의 피라미드를 출력할까요: ");
		n = scanner.nextInt();
		triangleLB(n);
		scanner.close();
	}
}


/*
	새로 알게 된 점
	for{
		for{}
		for{}
	}
	
	이 구조는 처음 사용해봤다!! 
*/