import java.util.Objects;
import java.util.Set;

public abstract class Driver {
    private String name;
    private boolean driverLicense;
    private int experience;

    public Driver(String name, boolean driverLicense, int experience) {
        this.name = name;
        this.driverLicense = driverLicense;
        this.experience = experience;
    }

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isDriverLicense() throws LicenseTypeException{
        return driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public abstract void startMoving();
    public abstract void stop();
    public abstract void refuelTheСar();

    public abstract void driversLicenseType() throws LicenseTypeException;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driverLicense == driver.driverLicense && experience == driver.experience && Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, driverLicense, experience);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", driverLicense=" + driverLicense +
                ", experience=" + experience +
                '}';
    }
}
