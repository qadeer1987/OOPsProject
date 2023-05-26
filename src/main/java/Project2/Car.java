package Project2;


class Car {
    private double carPrice;
    private String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double calculateSalePrice() {
        return carPrice;
    }
}

// Truck class extends Car
class Truck extends Car {
    private double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    @Override
    public double calculateSalePrice() {
        if (weight > 2000) {
            return super.calculateSalePrice() * 0.9; // 10% discount for weight > 2000
        } else {
            return super.calculateSalePrice() * 0.8; // 20% discount for weight <= 2000
        }
    }
}

// Sedan class extends Car
class Sedan extends Car {
    private double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    public double calculateSalePrice() {
        if (length > 20) {
            return super.calculateSalePrice() * 0.95; // 5% discount for length > 20
        } else {
            return super.calculateSalePrice() * 0.9; // 10% discount for length <= 20
        }
    }
}
