public class String_Reverse {
    public String reverse(String text) {
        StringBuilder builder = new StringBuilder(text);
        builder.reverse();
        return builder.toString();
    }
}
