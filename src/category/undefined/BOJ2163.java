package category.undefined;

import java.util.Scanner;

public class BOJ2163 {

	static int cutCount = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		cutChocolate(a, b);
		System.out.println(cutCount);
	}
	
	public static void cutChocolate(int horizontal, int vertical) {
		int bigger = horizontal > vertical ? horizontal : vertical;
		int less = horizontal <= vertical ? horizontal : vertical;
		if (bigger == 1 && less == 1) {
			
		} else {
			
			cutCount++;
			cutChocolate(1, less);
			cutChocolate(less, bigger-1);
		}
	}

}
