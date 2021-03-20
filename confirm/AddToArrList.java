package confirm;

import java.util.*;

public class AddToArrList {
    public static void main(String[] args) throws Exception {
        List list = new ArrayList();
        list.add("val1"); // 1
        list.add("val1.2"); // 1
        list.add(2, "val2"); // 2
        list.add(1, "val3"); // 3
        System.out.println(list);
    }

}
