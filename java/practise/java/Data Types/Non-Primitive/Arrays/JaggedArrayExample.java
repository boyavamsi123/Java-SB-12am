public class JaggedArrayExample {
    public static void main(String[] args) {
        int[][] jagged = new int[3][];
        jagged[0] = new int[]{1,2};
        jagged[1] = new int[]{3,4,5};
        jagged[2] = new int[]{6};

        for (int[] row : jagged) {
            for (int num : row) {
                System.out.println(num + " ");
            }
            System.out.println();
        }
    }
}