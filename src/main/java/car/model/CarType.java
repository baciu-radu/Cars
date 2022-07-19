package main.java.car.model;

public enum CarType {
    DIESEL("diesel"), GASOLINE("petrol"), ELECTRIC("electric");

    String type;

    CarType(String type) {

        this.type = type;
    }

    public String getType() {
        return type;
    }
}
