package inheritance;

public class instanceOf {
    public static void main(String ...M223){
		short s = 9;
		Integer ii= 9;
		int i = 9;
		Short ss = 9;
		
		boolean b = ii instanceof Number; // x io y, x cant be primitave
		System.out.println("Int instance of Number: " + b);
		
		System.out.println("== sh int: "+ (s==i));
		System.out.println("== Int int: "+ (ii==i));
		System.out.println("== Int sh: "+ (ii==s));
		//System.out.println("== Int S: "+ (ii==ss)); //compiler won't double unbox.
		
		//System.out.println("equals sh int: "+ s.equals(i)); //can't primative.equals()
		System.out.println("equals Int int: "+ ii.equals(i));
		System.out.println("equals Int sh: "+ ii.equals(s));
		System.out.println("equals Int S: "+ ii.equals(ss));
	}
}
