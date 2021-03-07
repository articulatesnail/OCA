package classDesign;

public class gorillaPolymorphism extends Animal {
    public static void main(String[] args) {
        Animal ani = new gorillaPolymorphism();
        System.out.println(ani.getName());
    }

    public String getName() { // DOES NOT COMPILE
        return "Gorilla";
    }
}

class Animal {
    public String getName() {
        return "Animal";
    }
}

