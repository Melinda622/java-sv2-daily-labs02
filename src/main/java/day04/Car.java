package day04;

public class Car {
    private double amountFuel;
    private double distance;

    public double calculateConsumption(){
        return amountFuel/distance*100;
    }

    public double getFuel() {
        return amountFuel;
    }

    public double getDistance() {
        return distance;
    }

    public void setAmountFuel(double amountFuel) {
        this.amountFuel = amountFuel;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
