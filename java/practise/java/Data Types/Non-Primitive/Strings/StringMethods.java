public class StringMethods {
    public static void main(String[] args) {
        String str = "Java Programming";

        System.out.println("Length: " + str.length());              // 16
        System.out.println("Uppercase: " + str.toUpperCase());      // JAVA PROGRAMMING
        System.out.println("Contains 'Java': " + str.contains("Java")); // true
        System.out.println("Substring: " + str.substring(5));       // Programming
        System.out.println("Char at 0: " + str.charAt(0));          // J
    }
}
