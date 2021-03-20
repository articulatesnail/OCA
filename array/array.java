package array;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
		//assign();
		sort();
    }
	
	static void assign(){
		double[] dArr = {3, 4, 5};
		double[] dArr1 = {3, 4, 5};
		double[] dArr2 = {3.0, 4.0, 5.0};
		
		short[] shortArr = new short[]{(short)1};
		// int[] intArr = shortArr;
		int [] i = {1,2,3};
		int ii [] = new int [] {12};
		int iii [] = {12};
		
		long ll[][] = new long[2][2];
		long l[] = {1l};
		// ll=l; 
		//nope, doesnt work.
	}
	
	static void sort(){
		int[]s={132,2,6,1232,424,1};
		//Arrays.sort(s);
		System.out.println(Arrays.binarySearch(s,1232));
		//for(int i : s){
			//System.out.print(i+ ", ");
		//}
		
	}

	

	
	
}
