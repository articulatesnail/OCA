package methods;

public class statics {
    public static void main(String[] args) {
		statics null_static = null;
		null_static.s_meth();
    }
	
	static int s_meth(){
		System.out.println("s_meth content");
		return 2;
	}
}
