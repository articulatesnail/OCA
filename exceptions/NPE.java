package exceptions;


public class NPE {

    static Integer newInt = null;
    public static void main(String[] args) {
        NPE npe = null;
        Integer a = npe.newInt;
        npe.print(a);

    }

    static void print(Integer a){
        System.out.println(a);
        a.toString(); 
    }

}
