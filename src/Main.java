import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            DriverB DriverB = new DriverB("driver №" + i, true, 3 + i);
            Cars Car = new Cars("Lada", "Granta", 1.8f, DriverB, "Механическая",
                    "Седан", "123213", 5);
            DriverC DriverC = new DriverC("driver №" + i, true, 5 + i);
            Trucks Trucks = new Trucks("Газ", "Cоболь", 3, DriverC, 1,
                    1680, "Бензин", 2);
            DriverD DriverD = new DriverD("driver №" + i, true, 10 + i);
            Bus Bus = new Bus("Mercedes", "Sprinter", 4, DriverD, 18000, 6,
                    "Максимальная", "Синий");
            printInfo(Car);
            printInfo(Trucks);
            printInfo(Bus);
            Car.getCarList().add(Car);
            Trucks.getTrucksList().add(Trucks);
            Bus.getBusList().add(Bus);
            DriverB.getDrivers().add(new DriverB("Сергей"));
            DriverB.getDrivers().add(new DriverB("Виталий"));
            DriverB.getDrivers().add(new DriverB("Сергей"));
            for (Driver driver : DriverB.getDrivers()) {
                System.out.println(driver.getName());

                HashMap<Transport, Mechanic> transportMechanic = new HashMap<>();

                Mechanic ivanMechanic = new Mechanic("Ivan", "Лукойл");
                Mechanic ivanMechanic2 = new Mechanic("Ivan", "Лукойл");
                transportMechanic.put(Car, ivanMechanic);
                transportMechanic.put(Car, ivanMechanic2);
                System.out.println(transportMechanic);
            }
        }


//        HashMap<Transport, Mechanic> transportMechanic = new HashMap<>();
//        Cars lada = new Cars("Lada");
//        Cars gaz = new Cars("Gaz");
//        Mechanic<Cars> ivanMechanic = new Mechanic("Ivan");
//
//        transportMechanic.put(lada, ivanMechanic);
//        transportMechanic.put(gaz, ivanMechanic);
//
//        System.out.println(transportMechanic);

//        ivanMechanic.service(lada);
//        ivanMechanic.service(gaz);
//        System.out.println(Transport.getTransportMechanic());
    }

    private static void printInfo (Transport transport){
        System.out.println("водитель " + transport.getDriver().getName() + " управляет автомобилем "
                + transport.getBrand() + " и будет участвовать в заезде");
    }
}