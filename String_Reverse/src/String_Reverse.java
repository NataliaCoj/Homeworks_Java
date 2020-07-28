
//There is a string, return the reversed string. "Hello" -> "olleH"
public class String_Reverse {
    public static void main(String[] args) {
        String str = "Hello";
        String reverse = new StringBuffer(str).reverse().toString();
        System.out.println("\nSource string: " + str);
        System.out.println("String after reverse: " + reverse);
    }
}
