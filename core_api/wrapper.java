package core_api;

public class wrapper {
    static String s;
  
    public static void main(String[] args) {
        valueOf();
        parseWrapper();
    }

    static void parseWrapper() {
        //these methods return primitive
        // static int ii; // static means belongs to whole class. nonsensical inside
        System.out.println("\n\nBoolean.parseBoolean(string) is case_insensitive: " + Boolean.parseBoolean("TRue"));
        System.out.println("b.pBool(static class var) type: " + ((Object)Boolean.parseBoolean(s)).getClass() );
        System.out.println("b.pBool(static class var):" + Boolean.parseBoolean(s));

    }

    public static void valueOf() {
        // returns wrapper class
        System.out.println("Boolean.valueOf (string) is case_insensitive: " + Boolean.valueOf("trUe"));
        System.out.println("Boolean.valueOf (string) class: " + Boolean.valueOf("trUe").getClass());
        System.out.println("Boolean.valueOf (boolean) : " + Boolean.valueOf(true));
        System.out.println("Boolean.valueOf (boolean) class: " + Boolean.valueOf(true).getClass());

    }
}
