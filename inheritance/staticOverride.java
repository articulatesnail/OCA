package inheritance;


public class staticOverride{
    public static void main(String[] args) {
        A a = new A();
        A.sM1();
        B.sM1();
    }
}

class A {
    public static void sM1() {
        System.out.println("base static");
    }


}

class B extends A{
    // public static void sM1() { //hidden static.
    //     System.out.println("in sub static");
    // }

   // can't have method with same signature in same class
    public void sM2() { //non-static can't override static
        System.out.println("in sub non static");
    }
}

class C extends B{
    public void sM2(){
        System.out.println("we in c");
    }
}

