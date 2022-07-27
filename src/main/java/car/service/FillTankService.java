package car.service;

import car.model.Car;

public class FillTankService {
    public double fillTank(double fillAmount, double fuelLevel, double tankCapacity) {
        double newFuelLevel = fillAmount + fuelLevel;
        if (tankCapacity < newFuelLevel) {
            System.out.println("Cannot fuel up, levels would be over the capacity of the tank");
            return fuelLevel;
        } else return newFuelLevel;
    }
}
