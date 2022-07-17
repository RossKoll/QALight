package lesson_6_Exchenge;

public class Euro extends Currency implements IsFreeConverted{

    private String name = "EUR";
    public Euro(double kursNBU) {
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
