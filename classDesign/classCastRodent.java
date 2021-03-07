package classDesign;

public class classCastRodent extends animal{  
	public final static void main(String [] ara){
		animal ani = new animal();
		//classCastRodent rod = (classCastRodent)ani; //class cast exception
		animal aniRod = new classCastRodent(); // if obj is just animal, then no rodent inside anirod. CCE
		classCastRodent aniRod2= (classCastRodent)aniRod; // this is fine beacuse subclass exists inside aniRod
	}
}

class animal {
	
}
