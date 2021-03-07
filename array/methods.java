package array;

public class methods{
public static void main(String... anything){
 

String str = "Hello";
StringBuilder sb = new StringBuilder(str);
StringBuilder sb2 =new StringBuilder(sb.append("?"));
System.out.println(sb2.append("!").equals(sb2.append("something crazy")));


}
}