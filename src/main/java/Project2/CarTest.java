package Project2;

public class CarTest {
    public static void main(String[] args) {
        // Creating a Car object
        Car car = new Car(20000, "Red");
        double carPrice = car.calculateSalePrice();
        System.out.println("Car Price: $" + carPrice);

        // Creating a Truck object
        Truck truck = new Truck(30000, "Blue", 2500);
        double truckPrice = truck.calculateSalePrice();
        System.out.println("Truck Price: $" + truckPrice);

        // Creating a Sedan object
        Sedan sedan = new Sedan(15000, "Black", 25);
        double sedanPrice = sedan.calculateSalePrice();
        System.out.println("Sedan Price: $" + sedanPrice);
    }
}
