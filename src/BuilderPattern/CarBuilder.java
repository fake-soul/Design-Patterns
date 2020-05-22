package BuilderPattern;

public class CarBuilder {
    private  String engine;
    private  String seats;
    private  String fuelTank;

    CarBuilder() {
        this.engine = null;
        this.seats = null;
        this.fuelTank = null;
    }

    public CarBuilder addSeats(String value) {
        this.seats = value;
        return this;
    }
    public CarBuilder addEngine(String value) {
        this.engine = value;
        return this;
    }
    public CarBuilder addFuelTank(String value) {
        this.fuelTank = value;
        return this;
    }

    public Car build() {
        return new Car(this.engine, this.fuelTank ,this.seats);
    }
}