package basics_data_types;

public class var_init {
    int instance_int;
    static int static_int = 12;
    double amount = 3.0;
    final short s = 3;

    final byte a = 3, aa = 3;
    byte b = a + aa; // can't narrow from int to byte, if not CT constants
    byte bb = 3 + 3; // why is this okay?
    // because implicit narrowing can happen only with compile time constants
   
    char c = 1;
    long l = 1;
    float f = 1;
    double d = 1;

    int a123;
    int _dsas;
    int __ede__;
    int $3434;

    String str = new String(new char[]{'2','2'});
	
	Short sh = new Short((short)1);
	Short sh1 = 1;
	Integer Int = 1;
	Integer Int1 = new Integer(1);
	
	final int fin_int;
	
	{
		fin_int =1;
	}
	
	//public var_init(){ //constructor
	//	fin_int = 1;
	//}

    final public static void main(final String[] args) {
        // new var_init().instanceMethod();
        var_init instance = new var_init();
        // System.out.println("print instance var: " + instance.instance_int);
        instance.thisRefStatic();
        representation();
    }

    static void hiddenFinalInSameClass() {
        final short s = 4; // this is successfully hidden, locally.
    }

    public void thisRefStatic() {
        System.out.println("static ref via .this: " + this.static_int);
        System.out.println("static ref via static: " + static_int);
        System.out.println("static ref via instancs: " + new var_init().static_int);

    }

    public void instanceMethod() {
        int method_int;
        System.out.println("if var not init, can't print var inside method");
        System.out.println("instance_int from method: " + instance_int);
        System.out.println("static_instance_int from instance method: " + static_int);
        System.out.println("static method from instance method: ");
        myStaticMethod();

    }

    public static void myStaticMethod() {
        System.out.println("\n\ncan't directly ref instance_int from static method, need a ");
        System.out.println("static var from static method: " + static_int);
        System.out.println("print inited instance var inside static: " + new var_init().instance_int);
    }

    public static void chainInit() {
        int a, b, c = 100;

        a = b = c;
        // int d = e = f = 100; //var must be init first to chain assign val
        int d;
        // int e = d; //f not yet init
    }

    static void representation() {
        double x = 0xb10_000; // 0x is hex. b is valid hex, NOT binary!
        float y = 0b10_000; // can't represent binary with a float
        int oct = 01234; // octal
        System.out.println("oct: " + oct);

    }

}

class sub extends var_init {
    final short s = 5; // this is hidden in the subclass
}
