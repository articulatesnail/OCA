package methods;

public class initialization {
	static {
		System.out.println("static init block"); // this runs without getting constructed
		new initialization();
	}

	{
		System.out.println("inst init block"); // this runs only when getting constructed

	}

	public static void main(String[] args) {
		new initialization();//
		new initialization();//
		meth1();
	}

	static synchronized private final void meth1() {
		System.out.println("in any order");
	}
}
