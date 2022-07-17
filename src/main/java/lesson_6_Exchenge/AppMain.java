package lesson_6_Exchenge;

public class AppMain {

    public static void main(String[] args) {

        Dollar dollar = new Dollar(36.5);

        System.out.println(String.format("Kurs NBU %s", dollar.getKursNBU()));
        dollar.exchangeCurrencyToGrn(1000);
        dollar.exchangeGnrToCurrency(36500);

        dollar.setMarga(1.15);
        dollar.exchangeCurrencyToGrn(1000);
        dollar.exchangeGnrToCurrency(36500);

        Euro euro = new Euro(38.0);
        euro.exchangeCurrencyToGrn(1000);

        Bitcoin bitcoin = new Bitcoin(23000);
        bitcoin.exchangeGnrToCurrency(23000);

    }
}
