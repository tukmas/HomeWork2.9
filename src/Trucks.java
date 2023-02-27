import java.util.ArrayList;

public class Trucks extends Transport <DriverC>{
    private int loadClass;
    private int height;
    private String fuelType;
    private int numberOfAxles;

    private ArrayList<Transport> trucksList;

    public enum LoadCapacity {
        N1 ("с полной массой до 3,5 тонн"),
        N2 ("с полной массой свыше 3,5 до 12 тонн"),
        N3 ("(с полной массой свыше 12 тонн");
        private final String Capacity;
        LoadCapacity (String Type){
            this.Capacity = Type;
        }
        public String getCapacity() {
            return Capacity;
        }
        @Override
        public String toString() {
            return "Грузоподъемность: " + getCapacity();
        }
    }

    public int getLoadClass() {
        return loadClass;
    }

    public int getHeight() {
        return height;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public Trucks(String brand, String model, float engineVolume, DriverC driver, int loadClass, int height, String fuelType, int numberOfAxles) {
        super(brand, model, engineVolume, driver);
        if (loadClass != 0){
            this.loadClass = loadClass;
        } else {
            this.loadClass = 1;
        }
        if (height != 0){
            this.height = height;
        }else {
            this.height = 1750;
        }
        if (fuelType != null){
            this.fuelType = fuelType;
        }else {
            this.fuelType = "Газ";
        }
        if (numberOfAxles >1){
            this.numberOfAxles = numberOfAxles;
        }else this.numberOfAxles = 3;

        trucksList = new ArrayList<>();
    }

    public ArrayList<Transport> getTrucksList() {
        return new ArrayList<>(trucksList);
    }

    @Override
    public void startedMoving() {
        System.out.println("Грузовой автомобиль марки " + getBrand() +  " начал движение");
    }

    @Override
    public void finishedMoving() {
        System.out.println("Грузовой автомобиль марки " + getBrand() +  " закончил движение");
    }

    @Override
    public void pitStop(String PitStop) {
        System.out.println("Пит-стоп у грузового автомобиля");
    }

    @Override
    public void timeLap(String BestLapTime) {
        System.out.println("Лучшее время круга у грузового автомобиля");
    }

    @Override
    public void maxSpeed(String MaxSpeed) {
        System.out.println("Максимальная скорость у грузового автомобиля");
    }

    @Override
    public void service(String command) {

    }

    @Override
    public void printType() {
        System.out.println("Данных по транспортному средству недостаточно");
    }

    @Override
    public void passDiagnostics() {
        System.out.println("Грузовой автомобиль проходит диагностику");
    }
}
