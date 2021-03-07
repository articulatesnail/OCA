package inheritance;

public class primative_return_inh {
  public static void main(String[] args) {
    A a = new A();
    A2 a2 = new A2();
    System.out.println(a2.m1(7));
    // call overloaded m1
    a2.m1(4f);
  }
}

class A {
  public float m1(int a) {
    char returned = 1;
    return returned;
  }
}

class A2 extends A {
  public float m1(int a) { // return types of primatives MUST match.
    return a;
  }

  float m1(float a) {
    System.out.println("printing float");
    return 4f;
  }
}

// byte, short, int, char, long, float, double