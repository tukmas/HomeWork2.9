import java.util.*;

public class Mechanic<R extends Transport & Competing> {
    private String name;
    private String company;

    private static Map<Set<Mechanic>, Set<Transport>> transportMechanic = new HashMap<>();

    public Mechanic(String Name) {
    }
    public void service(R mechanic){
        Set<Transport> transport = transportMechanic.getOrDefault(this, new HashSet<>());
        transport.add(mechanic);
        transportMechanic.put((Set<Mechanic>) this, transport);
    }

    public static Map<Set<Mechanic>, Set<Transport>> getTransportMechanic() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return name.equals(mechanic.name) && company.equals(mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company);
    }
}