package classDesign;

public class hiddenVar extends parent{
	String hiddenStr = "child string";
	
	public void nonStaticMethodToRefSuper(){
		System.out.println("super ref in inst meth: " + super.hiddenStr);

	}
	
    public static final void main(String...args){
		parent par = new hiddenVar();
		System.out.println("parent ref:" + par.hiddenStr);
		
		hiddenVar ch = new hiddenVar();
		System.out.println("child ref: " +ch.hiddenStr);
		ch.nonStaticMethodToRefSuper();
		//System.out.println("super ref " + super.hiddenStr); // can't ref super in static method.
	}
}

class parent {
	String hiddenStr = "parent string";
	
}