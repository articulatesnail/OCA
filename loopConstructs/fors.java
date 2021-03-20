package loopConstructs;

public class fors {
    public static void main(String args[]) {
        simpleFor();
    }

    static void sampleFor() {
        int[] a = new int[] { 1, 2, 3 };
        for (int i = 0; i < 3; System.out.println(a[i]))
            i++;
    }

    static void simpleFor() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
