public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};

        System.out.println("First number: " + numbers[0]);

        for(int num : numbers) {
            System.out.println(num);
        }

        System.out.println("Last number: " + numbers[4]);
    }
}