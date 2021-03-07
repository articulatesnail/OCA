package lambda;

public class Lambda {

    String v;

    public static void printWithFXParam(Lambda a){
        System.out.println(a);
        
    }
    public static void main(String [] args){
        int c = 3;
        Lambda l = new Lambda();
        l.v = "_String";
        printWithFXParam(l);
    }
}

