package confirm;

public class Rodent {
     protected  Integer chew()  {
        System.out.println("Rodent is chewing");
        return 1;
    }
    public static void main(String[] args) {
        Rodent r = new Beaver();
        r.chew();
    }
}

class Beaver extends Rodent {
     public Integer chew() {
        System.out.println("Beaver is chewing on wood");
        return 2;
    }
}