package Exercise.DefiningClasses.RawData;

public class Tyre {
    private double pressure;
    private int age;

    public Tyre(double pressure, int age) {
        this.pressure = pressure;
        this.age = age;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
