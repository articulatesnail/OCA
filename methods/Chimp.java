package methods;

//import static confirm.Rope.*;

public class Chimp {
    public static void main(String[] args) {
        Rope.swing();
        new Rope().swing();
        System.out.println(Rope.LENGTH);
    }
}

class Rope {
    static {
        LENGTH = 10; // this happens first
    }
    public static int LENGTH = 5; //declared in order. this is 2

    public static void swing() {
        System.out.print("swing ");
    }
}
