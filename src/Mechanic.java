import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Mechanic<T extends Transport> {
    private String name;
    private String company;

    public Mechanic(String name) {
    }
    public static HashMap<Transport, Mechanic> transportMechanic;
    public static HashMap<Transport, Mechanic> getTransportMechanic() {
        return transportMechanic;
    }

    public String getName() {
        return name;
    }
    public String getCompany() {
        return company;
    }

    public void carryOutMaintenance(){
        System.out.println("Механик " + getName() + " из компании " + getCompany() + " проводит техническое обслуживание автомобиля");
    }

    public void fixTheCar() {
        System.out.println("Механик " + getName() + " из компании " + getCompany() + " производит починку автомобиля");
    }
}