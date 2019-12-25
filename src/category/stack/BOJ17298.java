package category.stack;

import java.util.Stack;

public class BOJ17298 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arg = {3, 5, 2, 7};
		getNge(arg);
	}
	
	public static void getNge(int[] arr) {
		Stack<Integer> st = new Stack<Integer>();
		int[] nge = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			if (i == 0) {
				st.push(i);
			} else {
				if (arr[st.lastElement()] < arr[i]) {
					nge[st.lastElement()] = arr[i];
					st.pop();
					st.push(i);
				} else {
					st.push(i);
				}
			}
			System.out.println(st);
		}
		
		for (int i = 0; i < nge.length; i++) {
			System.out.println(nge[i]);	
		}
	}
}
