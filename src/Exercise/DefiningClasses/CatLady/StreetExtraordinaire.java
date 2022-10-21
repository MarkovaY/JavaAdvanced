package Exercise.DefiningClasses.CatLady;

public class StreetExtraordinaire extends Cat {
    private double meowingDecibels;

    public StreetExtraordinaire(String name, double meowingDecibels) {
        super(name);
        this.meowingDecibels = meowingDecibels;
    }

    public double getMeowingDecibels() {
        return meowingDecibels;
    }

    public void setMeowingDecibels(double meowingDecibels) {
        this.meowingDecibels = meowingDecibels;
    }

    @Override
    public String toString() {
        return String.format("StreetExtraordinaire %s %.2f", getName(), meowingDecibels);
    }
}