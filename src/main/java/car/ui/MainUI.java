package car.ui;

import car.model.Car;
import car.service.CarPark;
import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainUI extends UI {

    public void showMainUI(){
        UI ui = new MainUI();
        CreateCarUI createCarUI = new CreateCarUI();
        FillTankUI fillTankUI = new FillTankUI();
        CheckFuelUI checkFuelUI= new CheckFuelUI();
        CheckKMUI checkKMUI = new CheckKMUI();
        CheckYearUI checkYearUI = new CheckYearUI();
        TestDriveUI testDriveUI = new TestDriveUI();
        SellCarUI sellCarUI = new SellCarUI();


        CarPark carPark = new CarPark();

        Scanner in = new Scanner(System.in);
        String option = "";
        System.out.println("---------------------------------------------------" +
                "\n" + "CarPark" +
                "\n" +
                "\n" + "\t\t\t\t" + "1 - Create Car" +
                "\n" + "\t\t\t\t" + "2 - Fill Tank" +
                "\n" + "\t\t\t\t" + "3 - Check Fuel" +
                "\n" + "\t\t\t\t" + "4 - Check KM" +
                "\n" + "\t\t\t\t" + "5 - Check Year of Fabrication" +
                "\n" + "\t\t\t\t" + "6 - Show cars" +
                "\n" + "\t\t\t\t" + "7 - Sell Car" +
                "\n" + "\t\t\t\t" + "x - Close" +
                "\n" + "---------------------------------------------------"
        );
        while(option !="x"){

            option = in.nextLine();

            switch (option){
                case "1":
                        Car car = createCarUI.createCarUI();
                        carPark.addCarToPark(car);
                        showMainUI();
                        break;
                case "2":
                    fillTankUI.showFillTankUI();
                    break;
                case "3":
                    checkFuelUI.showCheckFuelUI();
                    break;
                case "4":
                    checkKMUI.showCheckKMUI();
                    break;
                case "5":
                    checkYearUI.showCheckYearUI();
                    break;
                case "6":
                    System.out.println("---------------------");
                    System.out.println("Here is your car park");
                    carPark.showCars();
                    System.out.println("---------------------");
                    break;
                case "7":
                    sellCarUI.showSellCarUI();
                    break;
                case "x":
                    ui.closeApplication();
                default:
                    System.err.println("Invalid option");
            }

        }

    }

    @Override
    public void closeApplication() {
        System.out.println("Closing application.");
        System.exit(0);
    }
}
