
import java.util.Scanner;

public class TwoDInputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] table = new int[2][3];

        System.out.println("Enter 6 numbers:");
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                table[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix:");
        for(int[] row : table) {
            for(int num : row) {
                System.out.println(num + " ");
            }
            System.out.println();
        }
    }
}