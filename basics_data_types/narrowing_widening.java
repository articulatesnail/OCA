package basics_data_types;

public class narrowing_widening {
    public static void main(String[] args) {
        new narrowing_widening().narrowing_primatives();
        new narrowing_widening().widening_primatives();

    }

    final void narrowing_primatives() {
        byte b = 0;
        short s = 0;
        char c = 0;
        int i = 0;
        long l = 20L;
        float f = 0F;
        double d = 0.0;

        // 1. The expression(RHS)is a compile time constant expression of type byte, char,
        // short, or int. (not D,F,L)
        // COMPILE TIME CONSTANTS!!

        // 2. The type of the variable (LHS)is byte, short, or char.

        
        b = (short) 1;
        b = 'c';
        b = -128;
        
        c = 1;
        c = (short) 2345;
        // c = 12L; // cant implicitly narrow long or double!
        s = 1;
        
        //nothing above int to narrow from

        // i = 12L; cant implicitly narrow long or double!
        // f = 23D; cant implicitly narrow long or double!


    // but non-compile time is diff! bc "could change", 
    //kvm can't guarantee, the short ref can fit into
        short s2 = 32000;   // 1
        char c2 = (char)s2;     // 2
        s2 = 'w' ;
        // char c3 = 65535;
        s2 = (short)c2;
    }
    
    void widening_primatives() {        
        // aka the normal ones.
        double d =23F;
        float f = 2;
        
        System.out.println("widening int to float: " + ((Object)f).getClass());
        System.out.println("widening float to double: " + ((Object)d).getClass());

    }
}
