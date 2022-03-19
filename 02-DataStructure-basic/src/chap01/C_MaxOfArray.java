//배열 요소의 최댓값 구하기 (입력받은 키의 최댓값을 구합니다)
package chap01;

import java.util.Scanner;

public class C_MaxOfArray {
	static int maxOf(int[] a) { // ***
		int max = a[0]; //처음 요소를 최댓값으로 저장
		for (int i = 1; i < a.length; i++)
			if (a[i] > max)
				max = a[i];

		return max;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력받은 키의 최댓값을 구합니다");
		System.out.print("사람 수 : ");
		int num = scanner.nextInt();// 배열의 요솟수 입력받기
		int height[] = new int[num];// 배열의 요솟수가 num인 배열을 생성

		for (int i = 0; i < num; i++) {
			System.out.print("height[" + i + "] = ");
			height[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
		
	}
}
