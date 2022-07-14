package stream;

import java.util.Arrays;

public class Largest {

	public static int getLargest(int[] a, int total) {
		Arrays.sort(a);
		return a[total-1];
	}
	
	public static void main(String[] args) {
		int a[]= {1,5,7,9,40,2};
		
		System.out.println("Largest: "+getLargest(a,6)); 
		
	}
}
