package loopConstructs;

public class unreachableLoops {
    public static void main(String[] args) {

    }

    public static void goodIf() {
        if (false) {
            System.out.println("false");
        }
    }

    public static void unreachable() {
        // while(false){
        // System.out.println("false");
        // }
        // int x = 0;
        // for( int i = 0; false; i++) x = 3;
    }
}
