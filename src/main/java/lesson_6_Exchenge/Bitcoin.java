package lesson_6_Exchenge;

public class Bitcoin extends Currency implements  IsCryptoCurrency{
    public Bitcoin(double kursNBU) {
        super(kursNBU);
    }

    @Override
    public String CurrencyName() {
        return null;
    }


    @Override
    public boolean isCryptoCurrency() {
        return true;
    }

    @Override
    public double exchangeGnrToCurrency (double numberOfGrn){
        System.out.println("Forbidden by NBU : you cannot buy Bitcoin");
        return numberOfGrn;
    }
}
