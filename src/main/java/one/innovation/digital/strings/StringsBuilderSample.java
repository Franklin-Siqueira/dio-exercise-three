package one.innovation.digital.strings;

public class StringsBuilderSample {
    public static void main(String[] args) {
        // Initialization
        var name = "Franklin";
        final var builder = new java.lang.StringBuilder(name);
        // Print
        System.out.println(builder.append("Siqueira"));
        // Initialization
        final var reverse = builder.reverse();
        // Print
        System.out.println(reverse);
        // Initialization
        final var insert = reverse.insert(0, "#").insert(reverse.length(), "#");
        // Print
        System.out.println(insert);
    }
}
