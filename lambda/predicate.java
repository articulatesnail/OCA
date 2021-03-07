package lambda;

import java.util.function.Predicate;

public class predicate {
    public static void main(String[] args) {
        predicate pre = new predicate();
        System.out.println(isRed(pre,  a -> {
            return a.color.equals("red");
        }));
        // isRed(pre, a -> System.out.println("a")); // predicate reutrns boolean
    }

    public static final String color = "red";

    public static boolean isRed(predicate p, Predicate<predicate> p2) {
        return p2.test(p);
    }

}
