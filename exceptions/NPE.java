package exceptions;


public class NPE {

    Integer newInt = null;
    public static void main(String[] args) {
        NPE npe = new NPE();
        var a = npe.newInt;
        print(a);
        // System.out.println(a);
        
        // .toString();

        // Object a = null;
        // Object b = "b";
        // b=a;
        // Object c = "c";
        // System.out.println(a);
        // b.toString();
    }

    static void print(Integer a){
        System.out.println(a);
        // a.toString(); 
    }
    
    
}
