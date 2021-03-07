package array;

import java.lang.*;
import java.rmi.server.ObjID;

public class objArray{
    public static void main(String[] args) {
       Object[] objArr = new Object[]{"aaa" , new Object(), 10, new String[]{""}};
       System.out.println(objArr[2].getClass());

        System.out.println("bad method");
        badMethod();    
       
    }

    static void badMethod(){
        String [] sA = {new String("")};
        String sA2 [] = {new String("")};
        String [] sA3 = new String[2] ;
        sA3[0] = "123";
        sA3[1] = "456";
        System.out.println(sA3[1]);
        
        
    }
}