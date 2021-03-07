package loopConstructs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import array.arrayList;

public class wierdFors {
    public static void main(String[] args) {
        
    }

    protected class largerObj{

    }


   
    static void myFor() {
        Object o = null;
        Collection c = new HashSet<String>();// valid collection object.
        Collection cs = new ArrayList<Integer>();
        int[][] ia = new int[3][3]; // valid array

        for(final Object o2 : c){}
        for(int i : ia[0]){ }
        for(int[] i :ia);

        for(int i =0 , j =0; i>j ; i++, j++, i--){

        }

    }
}
