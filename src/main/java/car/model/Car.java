package main.java.car.model;

public class Car {

    private String brand;
    private String model;
    private CarType carType;
    private int anFabricatie;
    private int kilometraj;
    private double volumRezervor;
    private double nivelCombustibil;
    private double consum;

    public Car (){

    }

    public Car(String brand, String model, int anFabricatie, int kilometraj, double volumRezervor, double nivelCombustibil, double consum) {
        this.brand = brand;
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.kilometraj = kilometraj;
        this.volumRezervor = volumRezervor;
        this.nivelCombustibil = nivelCombustibil;
        this.consum = consum;
    }

    public Car(String brand, String model, CarType carType) {
        this.brand = brand;
        this.model = model;
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", carType=" + carType +
                '}';
    }

    public void drive() {
        System.out.println("Driving car: " + this.toString());
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public int getKilometraj() {
        return kilometraj;
    }

    public void setKilometraj(int kilometraj) {
        this.kilometraj = kilometraj;
    }

    public double getVolumRezervor() {
        return volumRezervor;
    }

    public void setVolumRezervor(double volumRezervor) {
        this.volumRezervor = volumRezervor;
    }

    public double getNivelCombustibil() {
        return nivelCombustibil;
    }

    public void setNivelCombustibil(double nivelCombustibil) {
        this.nivelCombustibil = nivelCombustibil;
    }

    public double getConsum() {
        return consum;
    }

    public void setConsum(double consum) {
        this.consum = consum;
    }

    public CarType getCarType() {
        return carType;
    }
}
