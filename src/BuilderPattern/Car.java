package BuilderPattern;

public class Car {
    private  String engine;
    private  String fuelTank;
    private  String seats;

    Car(String engine, String fuelTank, String seats) {
        this.engine = engine;
        this.fuelTank = fuelTank;
        this.seats = seats;
    }

    public void printSpecs() {
        System.out.println(this.engine + " fT " + this.fuelTank + " s " + this.seats);
    }

}
