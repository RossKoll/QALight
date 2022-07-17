package lesson_6_Exchenge;

public class Som extends Currency implements IsFreeConverted{

    public Som(double kursNBU) {
        super(kursNBU);
    }

    @Override
    public String CurrencyName() {
        return "Uz Som";
    }

    @Override
    public boolean isFreeConv() {
        return false;
    }
}
