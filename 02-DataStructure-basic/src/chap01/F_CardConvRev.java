//기수 변환
//입력받은 10진수를 2진수~36진수로 기수변환하여 나타냄
//8진수 : 0, 1, 2, 3, 4, 5, 6, 7
//10진수 : 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
//16진수 : 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F
package chap01;

public class F_CardConvRev {
	static int cadConvR(int x, int r, char d[]) {
		int digits = 0;
		String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x%r); //r로 나눈 나머지를 저장
			x /= r; //x=x/r //x에 x/r을 저장
			
		}while(x!=0);
			return digits;
	}
}
