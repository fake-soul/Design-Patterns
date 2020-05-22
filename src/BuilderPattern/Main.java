package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        Car truck = new CarBuilder().addEngine("TVS").addFuelTank("5 L").addSeats("8").build();
        Car truck2 = new CarBuilder().addEngine("new TVS").addSeats("10 seat").addFuelTank("80 L").build();
        truck.printSpecs();
        truck2.printSpecs();
    }
}
