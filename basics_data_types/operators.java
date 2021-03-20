package basics_data_types;

public class operators {
    public static void main(String args[]) {

        byte b = 0;
        short s = 0;
        char c = 0;
        int i = 0;
        long l = 20L;
        float f = 0F;
        double d = 0.0;

        // System.out.println(4 + 4.0f + "is a float");
        // System.out.println(b+b + "is an int");
        // System.out.println(c + d +"is a double");
        // System.out.println(s +c +"is an int");

        int[] arr = { 0, -1, 127, 128, -128, -129 };
        for (int e : arr) {
            System.out.println("it is " + cache(e) + " that " + e + " is within the cache range");
        }

        shortcut();

    }

    static String cache(int arg) {
        Integer i = Integer.valueOf(arg);
        Integer j = i;
        i--;
        i++;

        return Boolean.valueOf(i == j).toString();
    }

    static void shortcut() {

        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean bool = (a = true) || ((b = true) && (c = true)); //second grouping implied
        System.out.print(a + ", " + b + ", " + c);
    }

}
