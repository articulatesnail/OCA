package array;

public class AssignAndRef {

    final static void one() {
        int[] a = { 1, 2, 3, 4 };
        int[] b = { 2, 3, 1, 0 };
        System.out.println(a[(a = b)[3]]); // first a in this line is evaled first, DESPITE parentheses
        // a1 == 1,2,3,4
        ///// a(inside)=2,3,1,0
        // a(inside)[3] ==0

        // a1[0] ==1
    }

    static private void two(){
        int i=1;
        int ia[][][] = new int [i][i=9][i];
        System.out.println( ia.length + ", " + ia[0].length+", e"+ ia[0][0].length); //1,9,9
        //always eval from L->R
    }

    public static void main(String[] args) {
        two();
    }
}

