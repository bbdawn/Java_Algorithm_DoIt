//소수 열거하기 ver2. 알고리즘 개선
//for(int n=5; n<=1000; n = n+2) -> 대상은 홀수만 ( 건너띄기 가능!)
package chap01;

public class G_PrimeNumber2 {
	public static void main(String[] args) {
		int counter = 0;			//곱셈과 나눗셈의 횟수
		int ptr = 0;				//찾은 소수의 개수
		int prime[] = new int[500];	//소수를 저장하는 배열
		
		prime[ptr++]=2;
		prime[ptr++]=3;
		
		for(int n=5; n<=1000; n = n+2) {//대상은 홀수만 
			boolean flag = false;
			for(int i=1; prime[i] * prime[i] <= n; i++) {
				counter +=2;
				if(n % prime[i] == 0) { //나누어떨어지면 소수가 아님!
					flag = true;
					break;				//더이상의 반복은 불필요함
				}//if
			}//for
			if(!flag) {
				prime[ptr++] = n;
				counter++;
			}//if
		}//for
		
		for(int i=0; i<ptr; i++) {
			System.out.println(prime[i]);
		}
		System.out.println("곱셈과 나눗셈을 수행한 횟수 : "+counter);
	}//main
}
