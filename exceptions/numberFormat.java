package exceptions;

public class numberFormat {

    public static float parseFloat(String s) {
        float f = 0.0f;
        // try{
        f = Float.valueOf(s).floatValue();
        return f;
        // }
        // catch(NumberFormatException nfe){
        // f = Float.NaN ;
        // return f;
        // }
        // finally{
        // f = 10.0f;
        // return f;
        // }
    }
    public static void main(String[] args) {
        System.out.println(parseFloat("0.0"));

    }
    
}
