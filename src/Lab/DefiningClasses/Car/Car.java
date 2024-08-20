package Lab.DefiningClasses.Car;


public class Car {

//    Create a class named Car.
//    The class should have public fields for:
//            •	Brand: String
//            •	Model: String
//            •	Horsepower: int

    public String brand;
    public String model;
    public int horsePower;

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

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.", getBrand(), getModel(), getHorsePower());
    }
}