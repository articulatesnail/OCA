package inheritance;

class parent{
	static void static_meth() throws Exception{
		System.out.println("static in parent");
	}
	
	void inst_meth()throws Exception{
		System.out.println("inst in parent");

	}
}

public class overrideException extends parent {
	
	public static void main(String... arga){
		call_inst();
		call_static();
	}
	
	static void call_inst(){
	try{
		parent parentWithKid = new overrideException();
		parent parent =  new parent();
		overrideException kid = new overrideException();
		
		System.out.print("calling this inst: "); kid.inst_meth(); //
		System.out.print("calling this inst with parent reference: "); parentWithKid.inst_meth(); //in child. overridden
		System.out.print("calling parent inst: "); parent.inst_meth(); //in parent
		
		System.out.println();
		}
	
	catch(Exception e){
		}
	}
	
	static void call_static(){
	try{
		parent parentWithKid = new overrideException();
		parent parent=  new parent();
		overrideException kid = new overrideException();

		System.out.print("calling static staticly: "); static_meth();
		System.out.print("calling static with parent reference: "); parentWithKid.static_meth(); //in parent.
		System.out.print("calling static with parent static: "); parent.static_meth(); //in parent
		
		
		}
	
	catch(Exception e){
		}
		
	}
	//this method is hidden, not overridden
	static void static_meth(){ //catching the exception is redundant here.
		System.out.println("static in child");
	} 	
	
	void inst_meth(){ //catching the exception is redundant here.
		System.out.println("inst in child");
	} 
	
	
    
}
