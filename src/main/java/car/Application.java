package main.java.car;

import main.java.car.model.Car;
import main.java.car.model.CarType;
import main.java.car.ui.MainUI;

public class Application {
    static MainUI mainUI = new MainUI();
    public static void main(String[] args) {
        mainUI.showMainUI();

//        Car car = new Car("Dacia", "Duster", CarType.DIESEL);
//        System.out.println(car);
//        car.drive();

    }

}
