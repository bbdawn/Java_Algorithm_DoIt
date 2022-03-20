//소수의 나열
//1,000 이하의 소수를 열거하기(ver1) 
//2부터 n-1까지 어떤 정수로도 나누어떨어지지 않음
//나누어떨어지는 정수가 하나 이상 존재하면 그 수는 합성수(composition number)
package chap01;

public class G_PrimeNumber1 {
	public static void main(String[] args) {
		int counter = 0; //나눗셈의 횟수
		int i;
		for(int n=2; n<=1000; n++) { //n : 나눠지는 수 (소수가 될 가능성이 있는 수)
			for(i=2; i<n; i++) { 	//i : 나누는 수
				counter++;
				if(n%i == 0) { //나누어지면 소수가 아님 -> 더이상 반복 필요없으니 break
					break;
				}//if
			}//for
			if(n==i) { //마지막까지 나누어떨어지지 않음
				System.out.println(n);
			}//if
		}//for
		System.out.println("나눗셈을 수행한 횟수 : "+counter);
	}//main
}
