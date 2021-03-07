package constructors_class_des;

public class supersuper {

    public void myMethod() {
        System.out.println("in supersuper");

    }

    public static void main(String[] args) {
        supersuper ss = new mySubSuper();
        ss.myMethod();

    }
}

class mySuper extends supersuper {
    public void myMethod() {
        System.out.println("in mySuper");
    }
}

class mySubSuper extends mySuper {
    public void myMethod() {
        super.myMethod();
        System.out.println("in mySubSuper");

    }

}