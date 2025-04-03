class Vehicle1 {
 
    String brand;
    int speed;

    public Vehicle1(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }

    public void start() {
        System.out.println("The vehicle is starting...");
    }
}
class Car extends Vehicle1 {
   
    int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed); 
        this.doors = doors;
    }
    @Override
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Doors: " + doors);
    }

   
    public void honk() {
        System.out.println("The car is honking!");
    }
}

class ElectricCar extends Car {

    int batteryCapacity;
    public ElectricCar(String brand, int speed, int doors, int batteryCapacity) {
        super(brand, speed, doors);  
        this.batteryCapacity = batteryCapacity;
    }
    @Override
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
    public void charge() {
        System.out.println("The electric car is charging...");
    }
}
public class vehicle {
    public static void main(String[] args) {
    	
        Vehicle1 vehicle = new Vehicle1("Toyota", 120);
        System.out.println("Vehicle Details:");
        vehicle.displayDetails();
        vehicle.start();
        System.out.println();

        // Creating a Car object (Single-level inheritance)
        Car car = new Car("Honda", 150, 4);
        System.out.println("Car Details:");
        car.displayDetails();
        car.start();
        car.honk();
        System.out.println();

        // Creating an ElectricCar object (Multi-level inheritance)
        ElectricCar electricCar = new ElectricCar("Tesla", 180, 4, 75);
        System.out.println("Electric Car Details:");
        electricCar.displayDetails();
        electricCar.start();
        electricCar.honk();
        electricCar.charge();
    }
}
