package Lab.DefiningClasses.CarConstructors;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

    // Creating first constructor
    public Car(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    // Crating second constructor
    public Car(String brand) {
        this(brand, "unknown", -1);
    }

    public String getBrand() {

        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {

        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {

        return horsePower;
    }

    public void setHorsePower(int horsePower) {

        this.horsePower = horsePower;
    }

    // Overriding toString method to print in the expected format
    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.", getBrand(), getModel(), getHorsePower());
    }
}