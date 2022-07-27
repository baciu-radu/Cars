package car.service;

import car.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarPark {
    private List<Car> carList = new ArrayList<>();

    public CarPark(){
    }

    public Car findCarByBrand(String brand){
        for (Car car: carList){
            if(car.getBrand().equals(brand)){
                return car;
            }
        }
        System.out.println("Car not found. Try again!");
        return null;
    }

    public List<Car> addCarToPark(Car car) {
        carList.add(car);
        return carList;
    }
    public void showCars(){
        for(Car car: carList){
            System.out.println(car);
        }
    }

    public List<Car> getCarList() {
        return carList;
    }
}
