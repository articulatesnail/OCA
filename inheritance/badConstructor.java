package inheritance;

public class badConstructor {
    
    class A {
        A(int i) {
            System.out.println("my super");
            
        }
    }

    class B extends A {
        B(){ // block is necessary to call the appropriate parent super class, since
            //a() doesnt exist
            super(1); // calls a(int).
        }

        B b = new B(); //calls b's no args
    }
}
