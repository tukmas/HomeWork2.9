import java.util.ArrayList;
import java.util.Objects;

public class Cars extends Transport <DriverB>{
    private String transmission;
    private String bodyType;
    private String registrationNumber;

    private int numberOfSeats;
    private ArrayList <Transport> carList;

    public Cars(String brand) {
        super(brand);
    }


    public enum BodyType1 {
        SEDAN ("Седан"),
        HATCHBACK ("Хетчбек"),
        COUPE ("Купе"),
        STATION_WAGON ("Универсал"),
        SUV ("Внедорожник"),
        CROSSOVER ("Кроссовер"),
        PICKUP ("Пикап"),
        VAN ("Фургон"),
        MINIVAN ("Минивэн");
        public final String Type;
        BodyType1(String Type){
            this.Type = Type;
        }
        public String getType() {
            return Type;
        }
        @Override
        public String toString() {
            return "Тип кузова:" + getType();
        }
    }
    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Cars(String brand, String model, float engineVolume, DriverB driver, String transmission, String bodyType, String registrationNumber, int numberOfSeats) {
        super(brand, model, engineVolume,driver);
        if (transmission != null){
            this.transmission = transmission;
        } else {
            this.transmission = "Автоматическая";
        }
        if (bodyType != null){
            this.bodyType = bodyType;
        }else {
            this.bodyType = "default";
        }
        if (registrationNumber != null){
            this.registrationNumber = registrationNumber;
        }else {
            this.registrationNumber = "A001AА01";
        }
        if (numberOfSeats >1){
            this.numberOfSeats = numberOfSeats;
        }else this.numberOfSeats = 5;

        carList = new ArrayList<>();
    }

    public ArrayList<Transport> getCarList() {
        return new ArrayList<>(carList);
    }

    @Override
    public void startedMoving() {
        System.out.println("Автомобиль марки " + getBrand() +  " начал движение");
    }

    @Override
    public void finishedMoving() {
        System.out.println("Автомобиль марки " + getBrand() +  " закончил движение");
    }

    @Override
    public void pitStop(String PitStop) {
        System.out.println("Пит-стоп у легкового автомобиля");
    }

    @Override
    public void timeLap(String BestLapTime) {
        System.out.println("Лучшее время круга у легкового автомобиля");
    }

    @Override
    public void maxSpeed(String MaxSpeed) {
        System.out.println("Максимальная скорость у легкового автомобиля");

    }

    @Override
    public void service(String command) {

    }

    @Override
    public void printType() {
        System.out.println("Данных по транспортному средству недостаточно");
    }

    @Override
    public void passDiagnostics() {System.out.println("Легковой атомобиль проходит диагностику");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cars cars = (Cars) o;
        return Float.compare(cars.numberOfSeats, numberOfSeats) == 0
                && Objects.equals(transmission, cars.transmission)
                && Objects.equals(bodyType, cars.bodyType)
                && Objects.equals(registrationNumber, cars.registrationNumber)
                && Objects.equals(carList, cars.carList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), transmission, bodyType, registrationNumber, numberOfSeats, carList);
    }
}
