package car.service;

import car.model.Car;

import java.security.PublicKey;
import java.util.Scanner;

public class CreateCarService {
    Scanner in= new Scanner(System.in);
    Car car = new Car();
    public void createCar(){
        System.out.println("Provide details for new car:");
        System.out.print("brand=");
        car.setBrand(in.nextLine());
        System.out.print("model=");
        car.setModel(in.nextLine());
        System.out.print("production year=");
        car.setProductionYear(in.nextInt());
        System.out.print("mileage=");
        car.setMileage(in.nextInt());
        System.out.print("tankCapacity=");
        car.setTankCapacity(in.nextDouble());
        System.out.print("fuelLevel=");
        car.setFuelLevel(in.nextDouble());
        System.out.print("fuelConsumption=");
        car.setFuelConsumption(in.nextDouble());
    }
    public void showNewCar(){
        System.out.println("Your Car:");
        System.out.print("\nbrand="+ car.getBrand());

        System.out.print("\nmodel="+car.getModel());

        System.out.print("\nproduction year="+car.getProductionYear());

        System.out.print("\nmileage="+car.getMileage());

        System.out.print("\ntankCapacity="+car.getTankCapacity());

        System.out.print("\nfuelLevel="+car.getFuelLevel());

        System.out.print("\nfuelConsumption="+car.getFuelConsumption()+
                "\n"+
                "\n");

    }


}
