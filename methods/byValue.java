package methods;

public class byValue {
    public static void main(String... aggs){
		sb_();
		// arr_();
		
	}
	
	// calling methods
	static void sb_(){
		StringBuilder a = new StringBuilder("0");
		StringBuilder b = new StringBuilder("1");
		mod(a,b);
		System.out.println("a: "+ a + " b: " +b);
	}
	
	// static void arr_(){
	// 	int[]value = {111,222};
	// 	System.out.println("1st value of arr: " + value[0]);
	// 	modArr(value);
	// 	System.out.println("1st value of arr after mod: " + value[0]);		
	// }

	// methods
	
	static void mod(StringBuilder sb1, StringBuilder sb2){
		sb2.append("change"); // the reference of a is copied to sb2
		sb2 = new StringBuilder("a new one");
		System.out.println("in mod b: " + sb2);

	}
	
	// static void modArr(int[] arr){
	// 	System.out.println("1st value of arr in modArry before mod: " + arr[0]);
	// 	arr[0]=333;
	// 	System.out.println("1st value of arr in modArry after mod: " + arr[0]);

	// }
	
}
