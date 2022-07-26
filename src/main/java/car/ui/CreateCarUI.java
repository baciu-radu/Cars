package car.ui;

import car.service.CreateCarService;

import java.util.Scanner;

public class CreateCarUI extends UI {
    FillTankUI fillTankUI = new FillTankUI();
    CreateCarService createCarService = new CreateCarService();

    public void showCreateCarUI() {
        createCarService.createCar();
        createCarService.showNewCar();

        UI ui = new CreateCarUI();
        Scanner in = new Scanner(System.in);
        String option = "";
        System.out.println("---------------------------------------------------" +
                "\n" + "CarPark" +
                "\n" +
                "\n" + "\t\t\t\t" + "2 - Fill Tank" +
                "\n" + "\t\t\t\t" + "3 - Check Fuel" +
                "\n" + "\t\t\t\t" + "4 - Check KM" +
                "\n" + "\t\t\t\t" + "5 - Check Year of Fabrication" +
                "\n" + "\t\t\t\t" + "6 - Test Drive" +
                "\n" + "\t\t\t\t" + "7 - Sell Car" +
                "\n" + "\t\t\t\t" + "x - Close" +
                "\n" + "---------------------------------------------------"
        );
        while (option != "x") {

            option = in.nextLine();

            switch (option) {
//                case "1":
//                    createCarUI.showCreateCarUI();
//                    break;
                case "2":
                    fillTankUI.showFillTankUI();
                    break;
//                case "3":
//                    checkFuelUI.showCheckFuelUI();
//                    break;
//                case "4":
//                    checkKMUI.showCheckKMUI();
//                    break;
//                case "5":
//                    checkYearUI.showCheckYearUI();
//                    break;
//                case "6":
//                    testDriveUI.showTestDriveUI();
//                    break;
//                case "7":
//                    sellCarUI.showSellCarUI();
//                    break;
                case "x":
                    ui.closeApplication();
                default:
                    System.err.println("Invalid option");
            }

        }
    }

    @Override
    public void closeApplication() {

    }
}
