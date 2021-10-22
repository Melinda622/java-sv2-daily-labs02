package day04;

public class GasStation {
   private double price;

    public GasStation(double price) {
        this.price = price;
    }

   public double tankFuel(Car car1,double liter){
        car1.setAmountFuel(liter);
        return price*liter;
    }

    public double getPrice() {
            return price;
        }
}
