package core_api;

import java.util.*;

public class string {
	public static void main(String[] args) {
		// string_meth();
		// replace();
		// isEmpty();
		// badDel();
		// insert();
		// indexOf();
		chaining();
		// confirm();
	}

	static void string_meth() {
		String a = "asdf";
		String b = "ASDF";
		int result = a.compareTo(b);
		System.out.println("asdf vs ASDF: " + result);

		String rev = new StringBuilder(a).reverse().toString();
		System.out.println("rev: " + rev);

		List<String> list = new ArrayList<>();
		list.add("asdf");
		list.add("asdf");
		boolean remove = list.remove("asdf");
		System.out.println("remove: " + remove);
		System.out.println("list afetr remove: " + list);

		list.add("one");
		list.add("two");
		System.out.println("list contains one: " + list.contains("one"));

		System.out.println("set(): " + list.set(1, "zero"));

	}

	static void replace() {
		System.out.println("abcda".replace("a", "e"));
	}

	static void isEmpty() {
		String untrimmed = new String(" ");
		String trimmed = untrimmed.trim();
		System.out.println(untrimmed.isEmpty());
	}

	static void badDel() {
		String str = "String Beans Forever!";
		// System.out.println(str.delete(6,11));
		// str = str.delete(); System.out.println(str);
		str.replace(" Bean", "");
		System.out.println(str);
		// System.out.println(new StringBuilder(str).delete(" Bean").toString());
	}

	static void confirm() {
		"a".replace("a", "b");
		"a".replace('a', 'b');
		// "a".replace(0,"a".length(),"b"); // String.replace(char,char)
		"a".replace(new StringBuilder('a'), "");
		"a".replace(new StringBuilder('a'), new StringBuilder("b"));
		// new StringBuilder("a").replace("","b"); //sb.replace is replace(int,int
		// String)
		// new StringBuilder("a").replace('a','b' );//
		new StringBuilder("a").replace(0, 1, "b");
	}

	static void insert() {
		StringBuilder sb = new StringBuilder("The");
		reload(sb);
		System.out.println(sb);

	}

	static void reload(StringBuilder sb) {
		sb.append(" Matrix");
		sb.insert(sb.length(), "rel new");
	}

	static void indexOf() {
		String str = new String("abc123adef");
		System.out.println("ind of a: " + str.indexOf('1', 123));
	}

	static void chaining() {
		String result = "AniMaL ".trim().toLowerCase().replace('a', 'A');
		System.out.println(result);
	}
}
