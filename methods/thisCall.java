package methods;

public class thisCall {
	int prop;
	
    public thisCall(){
		//comment
		this(1);
		System.out.println("in no args");
	}
	
	public thisCall(int i){
		//int k = 1 
		this(1,2); //this must be first uncommented line in the method		
		System.out.println("in 1 args");

	}
	
	public thisCall(int i, int j){
		System.out.println("in 2 args");
		this.prop = 1;
	}
	
	public final static void main(String[] adf){
		thisCall tc = new thisCall();
		System.out.println(tc.prop);
	}
}
