package basics_data_types;

public class arithmetic {
    public static void main(String[] args) {
        strangeFloat();
    }

    // static void assignmentPrecedent(){
    //     int[] a = { 1,2 };
    //     a[0] += (a[0] = 4) * (a[0] + 2); //a[0] =25
        
    //     int k = 1;
    //     k += (k = 4) * (k + 2) + a[0]; //same logic as []. 
    //     System.out.println(k + " , " + a[0]);
    // }

    static void strangeFloat(){
        float a = 10f;
        int b = 0;
        
        int []c = new int[b];
        
        System.out.println("c: " +  c);
        
    }

    static void division(){
        int rate = 1;
        int amount = 1 - 1/100*1 - rate/100;
    }

static void precedence(){
    int a = 6;
    System.out.println("this should print   :" + (3 > 3 || a == 4 ) );
    
}
 
}
