package car;

import car.model.Car;
import car.model.CarType;
import car.ui.MainUI;

public class Application {
    static MainUI mainUI = new MainUI();
    public static void main(String[] args) {
        mainUI.showMainUI();

//        Car car = new Car("Dacia", "Duster", CarType.DIESEL);
//        System.out.println(car);
//        car.drive();

    }

}
