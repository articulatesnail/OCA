package loopConstructs;

public class doWhile {
    public static void main(String[] args) {
        exA();

    }

    static void exA() {
        int var = 20, i = 0;
        System.out.println("i class: " + ((Object) i).getClass());

        do {
            while (true) {
                System.out.println("var: " + var + "i: " + i);
                
                if (i++ > var)
                    break;
            }
        } while (i < var--); // false, then var gets --
        System.out.println(var); // print 19.
    }
}
