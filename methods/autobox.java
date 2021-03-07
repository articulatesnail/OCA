package methods;

public class autobox {

    // static void m(int myint) {
    // System.out.println("in int");
    // }

    // static void m(Long myLLong) {
    //     System.out.println("in LLong");
    // }

    // static void m(long myllong) {
    //     System.out.println("in llong");
    // }

    static void m(Integer Int) {
        System.out.println("in Integer"); //prioritized over varargs
    }

    static void m(int... ints) {
        System.out.println("in varargs");
    }

    final public static void main(String... as) {
        // m(1L);
        m(1);
        // m(Integer.valueOf(1)); //Integer -> int 
    }
}
