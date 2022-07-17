package lesson_6_Exchenge;

abstract class Currency {

    private double kursNBU;
    private double marga = 1.1;

    public Currency(double kursNBU) {
        this.kursNBU = kursNBU;
    }

    public double getKursNBU() {
        return kursNBU;
    }

    public void setKursNBU(double kursNBU) {
        this.kursNBU = kursNBU;
    }

    public double getMarga() {
        return marga;
    }

    public void setMarga(double marga) {
        this.marga = marga;
    }

    public double getKursBuy(){
        return  kursNBU * marga;
    }

    public  double getKursSell(){
        return kursNBU / marga;
    }

    abstract public String CurrencyName();
    public double exchangeGnrToCurrency (double numberOfGrn){
        double temp = numberOfGrn / getKursBuy();
        System.out.println(
                String.format("For %s Grn you get %s %s by kurs %s (marga %s)",
                numberOfGrn, temp, CurrencyName(), getKursBuy(), marga));

        return temp;
    }

    public  double exchangeCurrencyToGrn(double numberOfCurency){
        double tempResult = numberOfCurency * getKursSell();
        System.out.println(
                String.format("For %s %s you get %s Grn by kurs %s (marga %s)",
                        numberOfCurency, CurrencyName(), tempResult, getKursSell(), marga)
        );
        return tempResult;
    }
}
