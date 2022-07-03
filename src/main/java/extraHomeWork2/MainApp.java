package extraHomeWork2;

import static extraHomeWork2.CalcClass.*;
import static extraHomeWork2.WorkWithMassive.analyzeMassive;

public class MainApp {

    public static void main(String[] args) {


        int rez_1 = sumDoubled(5, 5);
        String rez_2 = sumDoubled("Hello", "World!");
        int rez_3 = sumDoubled("5", 5);
        int rez_4 = multiplicationDoubled(5, 5);
        int rez_5 = divisionDoubled(0, 1);
        int rez_6 = division(2, 3);
        double rez_7 = division(2.0, 3.0);

        int[] myArray = new int[]{2, 4, 26, 7, 28, 10, 9, 20, 33};
        analyzeMassive(myArray, 1);

    }
}
