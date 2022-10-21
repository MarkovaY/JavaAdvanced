package Exercise.DefiningClasses.SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double amountPerKm;
    private int distanceTravelled;

    public Car(String model, double fuelAmount, double pricePerKM) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.amountPerKm = pricePerKM;
        this.distanceTravelled = 0;
    }

    public double calculateRequiredFuel(int distanceToTravel){
        return this.getAmountPerKm() * distanceToTravel;
    }

    public boolean hasEnoughFuel(int distance){
        return fuelAmount >= calculateRequiredFuel(distance);
    }

    public void drive(int distance){
        if (hasEnoughFuel(distance)){
            this.fuelAmount -= calculateRequiredFuel(distance);
            this.distanceTravelled += distance;
        } else {
            System.out.println("Insufficient fuel for the drive");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getAmountPerKm() {
        return amountPerKm;
    }

    public void setAmountPerKm(double amountPerKm) {
        this.amountPerKm = amountPerKm;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(int distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", model, fuelAmount, distanceTravelled);
    }
}