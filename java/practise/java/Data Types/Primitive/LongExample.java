public class LongExample {
    public static void main(String[] args) {
        Long distanceToMoon = 384400000L;
        Long distanceToSun = 149600000000L;

        long totalDistance = distanceToMoon + distanceToSun;

        System.out.println("Distance to the moon: " + distanceToMoon + " meters");
        System.out.println("Distance to the sun: " + distanceToSun + " meters");
        System.out.println("Total distance: " + totalDistance + " meters");
    }
}