//��� ��ȯ
//�Է¹��� 10������ 2����~36������ �����ȯ�Ͽ� ��Ÿ��
//8���� : 0, 1, 2, 3, 4, 5, 6, 7
//10���� : 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
//16���� : 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F
package chap01;

public class F_CardConvRev {
	static int cadConvR(int x, int r, char d[]) {
		int digits = 0;
		String dchar="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x%r); //r�� ���� �������� ����
			x /= r; //x=x/r //x�� x/r�� ����
			
		}while(x!=0);
			return digits;
	}
}
