package loopConstructs;

public class Switch {

	static final int a = 21;

	static void switch1(char c) {
		// char c = (char)i;
		switch (++c) {
			case '0': // '0' n!= char 0
				System.out.println("char 0");
			case 1:
				System.out.println("1");
			case 2 + 4:
				System.out.println("2");
				break;
			case 3:
			default:
				System.out.println("default");

			case 5:
			case a:

		}
	}

	public static void main(String[] areer) {
		switch1((char) 20);

	}
}