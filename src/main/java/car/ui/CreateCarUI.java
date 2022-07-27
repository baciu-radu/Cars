package car.ui;

import car.model.Car;
import car.service.CarPark;

import java.util.Scanner;

public class CreateCarUI{

    Scanner in = new Scanner(System.in);
    CarPark carPark = new CarPark();

    public Car createCarUI() {
        System.out.println("Provide details for new car:");
        System.out.print("brand=");
        String brand = in.nextLine();
        System.out.print("model=");
        String model = in.nextLine();
        System.out.print("production year=");
        int productionYear = in.nextInt();
        System.out.print("mileage=");
        int mileage = in.nextInt();
        System.out.print("tankCapacity=");
        double tankCapacity = in.nextDouble();
        System.out.print("fuelLevel=");
        double fuelLevel = in.nextDouble();
        System.out.print("fuelConsumption=");
        double fuelConsumption = in.nextDouble();
        return new Car (brand, model, productionYear, mileage, tankCapacity, fuelLevel, fuelConsumption);
    }
}
