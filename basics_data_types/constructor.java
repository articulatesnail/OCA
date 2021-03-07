package basics_data_types;

public class constructor {
    public constructor(){
        System.out.println("no args constructor");
    }

    final public static void constructor(){
        System.out.println("this is a method, not constructor");
    }
    public static void main(String[] args) {
        new constructor();
           
    }


}
