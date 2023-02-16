import java.util.*;

public class Mechanic<T extends Transport> {
    private String name;
    private String company;

        private static Map<Mechanic, Set<Competing>> competingTransport = new HashMap<>();

    public Mechanic(String Ivan) {
    }

    public static Map<Mechanic, Set<Competing>> getCompetingTransport() {
        return competingTransport;
    }

    public void service(T Transport){
        Set<Competing> competing = competingTransport.getOrDefault(this, new HashSet<>());
        competing.add(Transport);
        competingTransport.put(this, competing);
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
