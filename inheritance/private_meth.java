package inheritance;

class supers{
	private void my_meth(){
		System.out.println("my meth!");
	}
}


public class private_meth extends supers{
	public static void main(String arggg[]){
		supers sup = new private_meth();
		//sup.my_meth();
		private_meth pm = new private_meth();
		pm.my_meth();
	}
	private void my_meth(){
		System.out.println("no it's mine!");
	}
}
