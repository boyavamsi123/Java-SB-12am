class Car{

    String color;
    int speed;

    void drive() {
        System.out.println("The " + color + " car is driving at " + speed + "km/h.");
    }

    void stop() {
        System.out.println("The car has stopped. ");
    } 
}

    class CarExample {
    public static void main(String[] args) {
        
        Car myCar = new Car();

        myCar.color = "Red";
        myCar.speed = 80;

        myCar.drive();
        myCar.stop();
    }
}