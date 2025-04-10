import java.util.Scanner;
class Vehicle {
    private String brand;
    private double speed;
    private String fuelType;

    //constructor
    public Vehicle (String brand, double speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    //Encapsulation (getter)
    public String getbrand() {
        return brand; 
    }
    
    public double getspeed() {
        return speed; 
    }

    public String getfuelType() {
        return fuelType; 
    }

    //displayInfo
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: "  + speed);
        System.out.println("FuelType: " + fuelType);

    }
}
    //vehicle extend
    class Car extends Vehicle {
        private int numDoors;
    
    public Car(String brand, double speed, String fuelType, int numDoors) {
        super(brand, speed, fuelType);
        this.numDoors = numDoors;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NumDoors: " + numDoors);
    }
}
     //Motorcycle
     class Motorcycle extends Vehicle {
        private String hasSidecar;

    public Motorcycle (String brand, double speed, String fuelType, String hasSidecar) {
        super(brand, speed, fuelType);
        this.hasSidecar = hasSidecar;   
     
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + hasSidecar);
    }
}   

class TestVehicle {
    public static void main(String[] args) {
        Scanner eyy =  new Scanner(System.in);
    //Car
    System.out.println("Enter the Car details");
    System.out.print("Brand: ");
    String carBrand = eyy.nextLine();

    System.out.print("Speed: ");
    double carSpeed = eyy.nextDouble();

    System.out.print("fuelType: ");
    String carFuel = eyy.nextLine();
    eyy.nextLine();

    System.out.print("Number of Doors: ");
    int numDoors = eyy.nextInt();

    eyy.nextLine();
    //Motorcycle
    System.out.println("Enter the Motorcycle details");
    System.out.print("Brand: ");
    String motorBrand = eyy.nextLine();

    System.out.print("Speed: ");
    double motorSpeed = eyy.nextDouble();

    System.out.print("fuelType: ");
    String motorFuel = eyy.nextLine();
    eyy.nextLine();
    System.out.print("Has SideCar? ");
    String hasSidecar = eyy.nextLine();

    Car car = new Car(carBrand, carSpeed, carFuel, numDoors);
    System.out.println("Details of the Car");
    car.displayInfo();
    Motorcycle motor = new Motorcycle(motorBrand, motorSpeed, motorFuel, hasSidecar);
    System.out.println("Details of the Motorcycle");
    motor.displayInfo();

    System.out.println();
    eyy.close();
    }
}





