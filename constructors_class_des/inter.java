package constructors_class_des;
//interfaces can't share implementation, while abstract classes can

//public or default only
// can't be final, for funtional reasons
public interface inter {

    int INTER_INT = 4; //interfa    `nsace variables are public static final

    void child_must_inherit();

    default void def_method() { // only interfaces can have default methods
        System.out.println("default method in abstract class");

    }

     static void staticInInter(){
        System.out.println("static In interface");
        
    }

}
