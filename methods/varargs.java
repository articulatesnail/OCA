package methods;

public class varargs {
    public static void main(String... yaa){
		myMeth(1, new int[4]);
	}
	
	static final void myMeth(int ii, int...ints){
		for(int i : ints){
			System.out.println(i);
		}
	}
}
