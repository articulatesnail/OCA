package confirm;

public class FunWithArgs {
	
	long l = 1;
	char c = 3;
	static {
		String s = null;
		s.length();
	}

    public FunWithArgs() {
        System.out.println("no args");
    }

    public static void main(String[][] args) {
        System.out.println(args[0][0]);
    }

    FunWithArgs(int i) {
        System.out.println(i + " 1 args");
    }

    public static void main(String[] args) {
        String[] i = { "1", "2", "3" };
        String[][] newargs = { i };
        String[][] newargs2 = { i };

        FunWithArgs fwa = new FunWithArgs();
        fwa.main(newargs);
        new FunWithArgs(1);
		
		String [] aa = new String[]{"4","5","6"};
		m(aa);
    }
	
	static void m(String [] arrr){
		for (String i : arrr){
			System.out.println(i);
		}
	}

}
