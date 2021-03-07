package constructors_class_des;

public class concrete_ext_both extends abs_ext_abs{
    
    public void abs_meth_in_abs_ext_abs(){
        System.out.println("overriden method in parent abs");
        
    }

    void abs_meth(){ //access can be as or more visible
        System.out.println("overriding method in grandparent abs");
    }

    // public abstract void abs_method(); //only abs classes can 
}
