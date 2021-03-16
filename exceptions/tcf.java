package exceptions;

import java.io.FileNotFoundException;

public class tcf {
    public static void main(String args[]) {
        tf();
    }

    void outOfLoop() {
        int k = 0;
        try {
            int i = 5 / k;
        } catch (ArithmeticException e) {
            System.out.println("1");
        } finally {
            System.out.println("4");
        }
        System.out.println("outside of loop");
    }

    public void badThrow() throws Exception {
        // throw new Exception(); //needs a tc block, or throws
    }

    public void cascade() {
        try {
            String str = null;
            // System.out.println(str.length()); // NPE
            // int n = 3/0; // Arithmetic, runtime
            // throw new FileNotFoundException(); //
            throw new StackOverflowError();

        } catch (NullPointerException e) {
            System.out.println(e.getStackTrace());
            System.out.println("supposed st");
        } catch (RuntimeException e) {
            System.out.println("runtime");
        } catch (Exception e) {
            System.out.println("exception");
        }

        catch (Throwable e) {
            System.out.println("throwable");
        } finally {
            System.out.println("done");
        }
    }

    static void outOfScope() {
        int j = 3;
        try {
            int i = 0;
        } catch (Exception e) {
            int i = 3;
        } finally {
            int i = 3;

        }
        int i = 3;
    }

    static void tf() {
        try {
        } catch (Exception e) {
        } finally {
            // System.out.println("done");
        }
    }

}
