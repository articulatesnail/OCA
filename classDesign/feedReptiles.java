package classDesign;

public class feedReptiles {
	static void feedRepts(Reptiles rep){
		System.out.println(rep.getName());
	}
	

	public final static void main(String...args){
		feedRepts(new Croc());
		feedRepts(new Gator());
		feedRepts(new Reptiles());
	}
 
}

class Reptiles{
	String getName(){
		return "Reptile";
	}
}

class Croc extends Reptiles{
	String getName(){
		return "croc";
	}
}

class Gator extends Reptiles{
	String getName(){
		return "gator";
	}
}