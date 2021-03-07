package inheritance;

public class overridingB extends parentA {
    int i = 4;
    //B(){super()}

    public static void main(String[] args) {
        parentA a = new overridingB(); // implicit no args B() has implicit super()
        a.print();
    }

    void print() {
        System.out.println(i);
    } // i not yet initialized. default 0. see order 5)
}

class parentA {
    public parentA() {
        System.out.println("in the parentA clsas, before print()");
        print();
    } // actual object that calls is B. polymorphic. so line 12.

    void print() {
        System.out.println("A");
    }
}

/*
Important notes:
order of instantiation

1) Static blocks+field in order. of ancestor
2) Static blocks+field in order. of current
3) Instance block+fields in order. of ancestor
4) Constructors of ancestor, after it's instance fields initialized
5) Instance block+fields in order. of current //this is why int i stays at 0.
6) Construtor of current class
*/
