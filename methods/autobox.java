package methods;

public class autobox {

    static void equals() {
        Integer i = new Integer(42);
        Long ln = new Long(42);
        Double d = new Double(42.0);
        short s = (short) 5;
        Short S = 5;

        //only returns true if same Cclass
        System.out.println(i.equals(d));
        System.out.println(d.equals(ln));
        System.out.println(ln.equals(42));
        System.out.println(i.equals(S));

    }

    static void m(Integer Int) {
        System.out.println("in Integer"); // prioritized over varargs
    }

    static void m(int... ints) {
        System.out.println("in varargs");
    }

    final public static void main(String... as) {
        // m(1L);
        m(1);
        equals();
        // m(Integer.valueOf(1)); //Integer -> int
    }
}
