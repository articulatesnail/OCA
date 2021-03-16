package array;

// import java.util.ArrayList;
import java.util.*;

public class arrayList {
	public static void main(String[] args) {
		// add();
		remove();
	}

	static void add() {
		List<Integer> al = new ArrayList<Integer>();
		al.add(32);
		al.add(1234);
		al.add(1);
		al.add(2);
		System.out.println(al);
	}

	static void remove() {
		ArrayList AL = new ArrayList();
		AL.add("1.1");
		AL.add("2.1");
		AL.add("3.1");
		AL.add(Boolean.TRUE);
		//System.out.println(AL.remove("3.1")); // true
		//System.out.println(AL.remove(1)); // 2.1
		
		AL.forEach(n -> System.out.println(n));
	}
	
	static void multiD(){
		int[][] two;
		int[]	one;

		// two = one;
		//array dimensions must match
	}
}
