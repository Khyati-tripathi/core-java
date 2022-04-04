interface Builder {
    void reset();

    void setSeats(int number);

    void setEngine(Engine engine);

    void setTripComputer();

    void setGPS();

}

class Engine {
    private double volume;
    private double mileage;
    private String transmission;

    public Engine(double volume, double mileage, String transmission) {
        this.volume = volume;
        this.mileage = mileage;
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Engine [mileage=" + mileage + ", transmission=" + transmission + ", volume=" + volume + "]";
    }

}

class SportEngine extends Engine {

    public SportEngine() {
        super(3.0, 0.0, "SEMI_AUTOMATIC");
    }

}

class SUVEngine extends Engine {

    public SUVEngine() {
        super(3.5, 15, "MANUAL");
    }

}

class Car {
    int seatNumber;
    Engine engine;
    String tripComputer;
    String gps;

    public Car() {
        tripComputer = "Non-Functional";
        gps = "Non-Functional";
    }

    @Override
    public String toString() {
        return "Car [ engine=" + engine + ", gps=" + gps + ", seatNumber=" + seatNumber
                + ", tripComputer=" + tripComputer + "]";
    }

}

class CarBuilder extends Car implements Builder {
    private Car car;

    public void reset() {
        this.car = new Car();
    }

    public void setSeats(int number) {
        car.seatNumber = number;

    }

    public void setEngine(Engine engine) {
        car.engine = engine;
    }

    public void setTripComputer() {
        car.tripComputer = "Functional";
    }

    public void setGPS() {
        car.gps = "Functional";
    }

    public Car getResult() {
        return this.car;
    }

}

class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    void makeSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new SportEngine());
        builder.setTripComputer();
        builder.setGPS();

    }

    void makeSUV(Builder builder) {
        builder.reset();
        builder.setSeats(6);
        builder.setEngine(new SUVEngine());
        builder.setTripComputer();
        builder.setGPS();

    }
}

public class Client {
    public static void main(String[] args) {
        CarBuilder obj = new CarBuilder();
        Director d = new Director(obj);
        d.makeSUV(obj);
        System.out.println(obj.getResult());
    }

}
