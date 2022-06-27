package extraHomeWork2;

import static extraHomeWork2.Calculator.*;

public class MainApp {

    public static void main(String[] args) {


        sumDoubled(5, 5);
        sumDoubled("Hello", "World!");
        sumDoubled("5", 5);
        multiplicationDoubled(5,5);
        divisionDoubled(0,1);

        int[] myArray = new int[]{2,4,26,7,28,10,9,20,33};

        int number = 1;
        for (int i = 0; i < myArray.length ; i++){
            if(myArray[i] < 10){
                System.out.println(number + " : " + myArray[i] + " is less than 10");

            }
            if(myArray[i] == 10){
                System.out.println(number + " : " + myArray[i] + " is equal 10");

            }
            if(myArray[i] > 10){
                System.out.println(number + " : " + myArray[i] + " is more than 10");

            }
            number++;
        }

    }
}
