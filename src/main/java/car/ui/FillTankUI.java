package car.ui;

import car.model.Car;
import car.service.FillTankService;

import java.util.Scanner;

public class FillTankUI extends UI{
    FillTankService fillTankService = new FillTankService();
    Car car = new Car();
    Scanner in = new Scanner(System.in);
    public void showFillTankUI(){

        FillTankService fillTankService = new FillTankService();
        System.out.println("Current Fuel Level"+car.getFuelLevel());
        System.out.println("Please enter fuel to be added:");
        double fillAmount = in.nextDouble();
        fillTankService.fillTank(fillAmount,car.getFuelLevel(), car.getTankCapacity());
    }

    @Override
    public void closeApplication() {

    }
}
