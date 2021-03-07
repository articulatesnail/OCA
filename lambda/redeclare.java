package lambda;

import java.util.function.Predicate;

public class redeclare {

    public static boolean validateEmployee(Employee e, Predicate<Employee> p) {
        return p.test(e);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(validateEmployee(e, p -> p.age > 12));

    }
}

class Employee {
    int age;
}
