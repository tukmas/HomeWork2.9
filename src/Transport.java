import java.util.ArrayList;

public abstract class Transport <T extends Driver> implements Competing{
    private String brand;
    private String model;

    private float engineVolume;

    private T driver;

    private ArrayList <Mechanic> mechanic;

    public Transport(String brand) {
    }

    public void addMechanic (Mechanic mechanic){
        this.mechanic.add(mechanic);
        System.out.println(getBrand() + " обслуживает " + mechanic.getName());
    }

    public ArrayList<Mechanic> getMechanic() {

        return new ArrayList<>(mechanic);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public Transport(String brand, String model, float engineVolume, T driver) {
        if (brand != null) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (engineVolume >= 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5f;
        }
        setDriver(driver);
    }
    public abstract void startedMoving();

    public abstract void finishedMoving();

    public abstract void printType();

    public abstract void passDiagnostics() throws TransportTypeException;

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

}
