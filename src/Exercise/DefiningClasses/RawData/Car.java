package Exercise.DefiningClasses.RawData;

import java.util.List;

public class Car {
    private Engine engine;
    private Cargo cargo;
    private List<Tyre> tyres;

    public Car( Engine engine, Cargo cargo, List<Tyre> tyres) {
        this.engine = engine;
        this.cargo = cargo;
        this.tyres = tyres;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public List<Tyre> getTyres() {
        return tyres;
    }

    public void setTyres(List<Tyre> tyres) {
        this.tyres = tyres;
    }
}
