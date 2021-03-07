package exceptions;

public class errors {
    public static void main(String[] args) {
    }

    public void t() throws Throwable {
        System.out.println("in t");
    }

}

class subError extends errors {
    public void t() throws Exception {
        System.out.println("in sub error");
    }
}

class subsubError extends subError {


}

class sibSubError extends errors {
   public void t() throws Error {
    }
}