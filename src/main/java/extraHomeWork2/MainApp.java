package extraHomeWork2;

import static extraHomeWork2.CalcClass.*;
import static extraHomeWork2.WorkWithMassive.*;

public class MainApp {

    public static void main(String[] args) {


        int rez_1 = sumDoubled(5, 5);
        String rez_2 = sumDoubled("Hello", "World!");
        int rez_3 = sumDoubled("5", 5);
        int rez_4 = multiplicationDoubled(5, 5);
        int rez_5 = divisionDoubled(0, 1);
        int rez_6 = division(2, 0);
        double rez_7 = division(2.0, 3.0);
        division(1, 0.0);

        int[] myArray = new int[]{2, 4, 26, 7, 28, 10, 9, 20, 33};
        int[] myArray2 = {};
        analyzeMassive(myArray, 1);



        // ========   Part I : work with Array


        int[][] createdArray = fillIn2DArray(3, 3, 8);
        print2DArray(createdArray);

        // function accept array and fill in left diagonal with predefined number
        System.out.println("Array with LEFT diagonal : ");
        int[][] arrayFilledWithLeftDiagonal = fillInLeftDiagonal(createdArray,1);


        //fillInLeftDiagonal(arrayFilledWithLeftDiagonal,1);
        System.out.println("Array with RIGHT diagonal : ");
        int[][] arrayFilledInWithRightDiagonal = filInRightDiagonal(createdArray,3);


        // function accept array and fill in left diagonal with predefined number
        System.out.println("Array with RIGHT diagonal : ");
        int[][] arrayRight = fillIn2DArray(3, 3, 8);
//
//        // function accept array and fill in two diagonals(left and right) with predefined number
        System.out.println("Array with TWO diagonals : ");
        int[][] arrayTwoDiagonal = fillIn2DArray(3, 3, 8);
        int[][] filledArray = fillInTwoDiagonal(arrayTwoDiagonal,3);



        // =======   Part II : work with String


//        String name = " Test_String ";
//        System.out.println(name.trim());
//        System.out.println(name.substring(1, 5));
//        System.out.println(name.trim().replaceFirst("s", "y"));
//
//        String character = "T";
//        if (name.trim().toUpperCase().startsWith(character)) {
//            System.out.println("First symbol is 'T'");
//        }

    }
}
