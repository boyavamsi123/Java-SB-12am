public class StringArrayExample {
    public static void main(String[] args) {
        String[] fruits = new String[3];

        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Cherry";

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}