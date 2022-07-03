package extraHomeWork2;

public class CalcClass {

    /**
     * this method accepts int objects
     * function adds two numbers and return its sum
     *
     * @param numberOne int
     * @param numberTwo int
     * @return sum of two numbers
     */
    public static int sumDoubled(int numberOne, int numberTwo) {
        int sum = (numberOne + numberTwo) * 2;
        System.out.println("Sum of two integer is equal : " + sum);
        return sum;
    }

    /**
     * this method  accepts two String objects
     * function adds two Strings objects
     *
     * @param one String
     * @param two String
     * @return concatenation two strings
     */
    public static String sumDoubled(String one, String two) {
        String sum = one + two + one + two;
        System.out.println("Concatenation of Strings is : " + sum);
        return sum;
    }

    ;


    /**
     * this method  accepts String and integer objects
     * function adds Strings and int objects
     *
     * @param numberString String
     * @param numberInt    int
     * @return sum
     */
    public static int sumDoubled(String numberString, int numberInt) {
        int sum = 0;
        try {
            sum = Integer.parseInt(numberString + numberInt) * 2;
        } catch (NumberFormatException e) {
            System.out.println("Entered string is not acceptable due to followed error: " + e);
        }
        System.out.println("Sum of String and integer is equal string : " + sum);
        return sum;
    }

    /**
     * this method  accepts two integer objects
     * function multiply int objects
     *
     * @param numberOne int
     * @param numberTwo int
     * @return sum of multiply two int
     */
    public static int multiplicationDoubled(int numberOne, int numberTwo) {
        int sum = (numberOne * numberTwo) * 2;
        System.out.println("Multiplication of two integer is equal : " + sum);
        return sum;
    }

    /**
     * this method  accepts two integer objects
     * function divide int objects
     * check if second number is not '0'
     *
     * @param numberOne int
     * @param numberTwo int
     * @return sum
     */
    public static int divisionDoubled(int numberOne, int numberTwo) {
        int sum = 0;
        if (numberTwo == 0) {
            System.out.println("Cannot divide by 0");
        } else {
            sum = (numberOne / numberTwo) * 2;
        }
        System.out.println("Result of division is : " + sum);
        return sum;
    }


    // Homework #3

    public static int division(int var1, int var2){
        int sum = 0;
        if (var2 == 0) {
            System.out.println("Cannot divide by 0");
        } else {
            sum = var1 / var2;
        }
        System.out.println("Result of division is : " + sum);
        return sum;
    }

    public static double division(double var1, double var2){
        double sum = 0;
        if (var2 == 0) {
            System.out.println("Cannot divide by 0");
        } else {
            sum = var1 / var2;
        }
        System.out.println("Result of division is : " + sum);
        return sum;
    }
}
