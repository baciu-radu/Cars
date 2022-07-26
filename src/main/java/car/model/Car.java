package car.model;

public class Car {

    private String brand;
    private String model;
    private CarType carType;
    private int productionYear;
    private int mileage;
    private double tankCapacity;
    private double fuelLevel;
    private double fuelConsumption;

    public Car (){

    }

    public Car(String brand, String model, int productionYear, int mileage, double tankCapacity, double fuelLevel, double fuelConsumption) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.mileage = mileage;
        this.tankCapacity = tankCapacity;
        this.fuelLevel = fuelLevel;
        this.fuelConsumption = fuelConsumption;
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

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public CarType getCarType() {
        return carType;
    }
}
