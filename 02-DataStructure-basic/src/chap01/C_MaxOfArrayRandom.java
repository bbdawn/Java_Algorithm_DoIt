//난수를 사용해 배열의 요솟값 설정하기 
//배열의 요소에 값을 하나씩 입력하는 것이 귀찮을 경우에 각 요소에 난수를 대입할 수 있다
package chap01;

import java.util.Random;
import java.util.Scanner;

public class C_MaxOfArrayRandom {
	static int maxOf(int[] a) {
		int max= a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}//if
		}//for
		return max;
	}//maxOf
	public static void main(String[] args) {
		Random random=new Random();
		Scanner scanner=new Scanner(System.in);
		System.out.println("키의 최댓값을 구하는 프로그램입니다.");
		System.out.print("사람 수 : ");
		int num = scanner.nextInt();
		
		int height[] = new int[num];
		
		System.out.println("키 값은 아래와 같습니다");
		for(int i=0; i<num; i++) {
			height[i] = 100 + random.nextInt(90);
			System.out.println("height["+i+"] = "+height[i]);
		}
		
		System.out.println("최댓값은 "+maxOf(height)+"입니다");
		
		scanner.close();
	}//main
}
