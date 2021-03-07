package exceptions;
import java.io.FileNotFoundException;

public class tcf {
    public static void main(String args[]) {
        // int k = 0;
        // try {
        //     int i = 5 / k;
        // } catch (ArithmeticException e) {
        //     System.out.println("1");
        // } finally {
        //     System.out.println("4");
        // }
        
        // System.out.println("outside of loop");

        try{
            String str = null;
            // System.out.println(str.length()); // NPE
            // int n = 3/0; // Arithmetic, runtime
            // throw new FileNotFoundException(); //
            throw new StackOverflowError();

        }catch (NullPointerException e){
            System.out.println(e.getStackTrace());     
            System.out.println("supposed st");     
        }
        catch (RuntimeException e){
            System.out.println("runtime");     
        }
        catch (Exception e){
            System.out.println("exception");     
        }
        // catch (Error e){
        //     System.out.println("error");     
        // }
        catch (Throwable e){
            System.out.println("throwable");     
        }
        finally{
        System.out.println("done");
                }
    }

    public void badThrow(){
      //  throw new Exception(); //needs a tc block, or throws
    }

    static void outOfScope(){
        int j =3;
        try{
            int i = 0;
        }
        catch (Exception e){
            int i =3;
        }
        finally{
           int i =3;

        }
        int i =3;
    }

}
