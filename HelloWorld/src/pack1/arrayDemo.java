package pack1;

public class arrayDemo {
	public static void main(String[] args) {
		//single dimensational array
		int a[]= {10,20,30,40,50};
		for(int i=0;i<5;i++) {
		System.out.println("Elements of array a: "+a[i]);
		}


		//multidimensional array
		int[][] b = {
		            {6,4,9,2}, 
		            {6,3,9} };
		      
		      System.out.println("\nLength of row 1: " + b[0].length);
		      }
	}


