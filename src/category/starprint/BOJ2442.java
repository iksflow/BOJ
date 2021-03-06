package category.starprint;

import java.util.Scanner;

/*
 * 문제
첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제

별은 가운데를 기준으로 대칭이어야 한다.

입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.

출력
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

예제 입력 
5
예제 출력 1 
    *
   ***
  *****
 *******
*********
 */
/*
 * 나의 풀이 방법
 * N = 입력받은 값. i = 현재 line number
 * 1. 1 ~ 입력값 N번째 줄까지의 별을 찍어야 하는데, 좌우 대칭을 이루도록 공백을 섞어가며 별을 출력해야한다.
 * 2. 특정 line의 공백 개수 : N - i개. 별의 개수 : 2i - 1개.  
 * 3. 2번의 연산을 N번 반복하면 된다. 
 */
class BOJ2442 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 1; i <= n; i++) {
			// 공백 찍기
			for(int count = 0; count < n - i; count++) {
				System.out.print(" ");
			}
			// 별 찍기
			for(int count = 0; count < 2 * i - 1; count++) {
				System.out.print("*");
			}
			System.out.println();
		}		
//		printer(n);
	}
	
	
	public static void printer(int n) {
		for(int i = 1; i <= n; i++) {
			// 공백 찍기
			for(int count = 0; count < n - i; count++) {
				System.out.print(" ");
			}
			// 별 찍기
			for(int count = 0; count < 2 * i - 1; count++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
