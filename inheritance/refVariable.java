package inheritance;

public class refVariable {
    // if in single file, pubclass needs to be first, so compiler can readit
    public static void main(String[] args) throws Exception {
        Flyer f = new Eagle("American Bald Eagle");
        System.out.println("f.getName(): " + f.getName());
        System.out.println("((Eagle)f).getName(): " + ((Eagle) f).getName());
        System.out.println("((Bird)f).getName(): " + ((Bird) f).getName());
        System.out.println("((Flyer)f).getName(): " + ((Flyer) f).getName());

    }
}

interface Flyer {
    String getName();
}

class Bird implements Flyer {
    public String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Eagle extends Bird {
    public Eagle(String name) {
        super(name);
    }
}
