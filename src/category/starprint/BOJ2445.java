package category.starprint;

import java.util.Scanner;

/*
 * 문제 이름 : 별 찍기 - 8

문제
예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

예제 입력 
5
예제 출력 1 
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
 */
/*
 * 나의 풀이 방법
 * N = 입력받은 값. i = 현재 line number
 * 1. 1 ~ 입력값 2N - 1번째 줄까지의 별을 찍어야 하는데, 좌우 대칭을 이루도록 공백을 섞어가며 나비 모양으로 별을 출력해야한다.
 * 2. Loop를  사용해서 한개는 별, 공백 순으로 찍고 나머지는 공백, 별 순으로 찍어주면 된다.
 * 3. 
 */
public class BOJ2445 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= 2 * n - 1; i++) {
			// i가 1~N일경우
			if (i <= n) {
				// 공백 찍기
				for(int count = 0; count < n - i; count++) {
					System.out.print(" ");
				}
				// 별 찍기
				for(int count = 0; count < 2 * i - 1; count++) {
					System.out.print("*");
				}
			}

			if (n < i) {
				// 공백 찍기
				for(int count = 0; count < i - n; count++) {
					System.out.print(" ");
				}
				// 별 찍기
				for(int count = 0; count < (2 * n - i) * 2 - 1; count++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}		
	}

}
