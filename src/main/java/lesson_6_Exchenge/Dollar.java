package lesson_6_Exchenge;

public class Dollar extends Currency implements IsFreeConverted{

    private String name = "USD";
    public Dollar(double kursNBU) {
        super(kursNBU);
    }

    @Override
    public String CurrencyName() {
        return name;
    }

    @Override
    public boolean isFreeConv() {
        return true;
    }
}
