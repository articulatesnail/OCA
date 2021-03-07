package exceptions;

public class unreachable {
    public static void main(String[] args) {
    }

    public static void unreachable() {

        try {
            throw new Exception();
            // return;
        } catch (Exception e) {
            return;
        } finally {
            System.out.println("");            
        }
        // return; //always unreachable
    }
}
