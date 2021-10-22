package day04;

public class CarMain {
        public static void main(String[] args) {
            Car car1=new Car();
            car1.setAmountFuel(30.0);
            car1.setDistance(50.0);
            System.out.println("Consumption: "+car1.calculateConsumption()+" liters");

            GasStation gasstation=new GasStation(1.58);
            System.out.println("Cost of car tank: "+gasstation.tankFuel(car1,80)+" EUR");
    }
}
