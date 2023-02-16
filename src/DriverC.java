import java.util.HashSet;
import java.util.Set;

public class DriverC extends Driver {
    public DriverC(String name, boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
        drivers = new HashSet<>();
    }
    public DriverC(String name) {
        super(name);

    }
    private Set<Driver> drivers;

    public Set<Driver> getDrivers() {
        return drivers;
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории С" +getName() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категории С" +getName() + " закончил движение");
    }

    @Override
    public void refuelTheСar() {
        System.out.println("Водитель категории С" +getName() + " нзаправляет автомобиль");
    }
    @Override
    public void driversLicenseType() {
        try {
            isDriverLicense();
        } catch (LicenseTypeException e) {
            System.out.println("Произошла ошибка");
            System.out.println("Необходимо указать тип прав!");
        }
    }
}
