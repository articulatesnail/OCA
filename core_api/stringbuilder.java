package core_api;

public class stringbuilder {
    public static void main(String[] args) {
        //comparing();
		//appendCharArr();
		setLength();
    }

    static void comparing(){
        StringBuilder sb= new StringBuilder();
        System.out.println(sb.append("1").equals(sb.append(2)));
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder().append(3);
        StringBuilder sb3 = new StringBuilder().append(3);
        System.out.println("sb2 vs 3 result: " + sb2.equals(sb3)); // false
        System.out.println("sb2 vs appended result: " + sb2.equals(sb2.append("more chars"))); // true
    }
	
	static void appendCharArr(){
		var sb = new StringBuilder("123");
		// var stri = new String[]{'c', 's', 'b'};
		var stri = new char[]{'c', 's', 'b'};
		System.out.println("String[]: " + stri[1]);

		sb.append(stri);
		System.out.println(sb);
	}
	
	static void setLength(){
		var sb = new StringBuilder("012345");//.setLength returns void, can only assign on next line
		sb.setLength(4);
		System.out.println("012345.setLength(): " + sb); //0123
	}
}
