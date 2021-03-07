package constructors_class_des;

public class impl_inter implements inter {
    public void child_must_inherit() { // impl at least as accessible
        System.out.println("child must inherit implementation");

    }

    
    int child_must_inherit(int muhoverload){
        return 1;
    }
}
