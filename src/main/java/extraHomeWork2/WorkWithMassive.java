package extraHomeWork2;

public class WorkWithMassive {

    public static void analyzeMassive(int[] massive, int varForComparing) {
        int number = 1;

        if (massive.length == 0) {
            System.out.println("Array length is equal : '0'");
        }
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] < varForComparing) {
                System.out.println(number + " : " + massive[i] + " is less than " + varForComparing);

            } else if (massive[i] == varForComparing) {
                System.out.println(number + " : " + massive[i] + " is equal " + varForComparing);

            } else if (massive[i] > varForComparing) {
                System.out.println(number + " : " + massive[i] + " is more than " + varForComparing);
            } else {
                System.out.println(number + " : " + massive[i]);
            }
            number++;
        }

    }

    public static int[][] fillIn2DArray(int numberOfRow, int numberOfColumn, int elementToInput) {
        int[][] myArray = new int[numberOfRow][numberOfColumn];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = elementToInput;
            }
        }
        return myArray;
    }

    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] fillInLeftDiagonal(int[][] array, int number) {
        if (isMatrixSquare(array)) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i == j) {
                        array[i][j] = number;
                    }
                }
            }
        }
        print2DArray(array);
        return array;
    }

    public static int[][] filInRightDiagonal(int[][] array, int number) {
        if (isMatrixSquare(array)) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if ((i + j + 1) == array.length) {
                        array[i][j] = number;
                    }
                }
            }
        }
        print2DArray(array);
        return array;
    }

    public static int[][] fillInTwoDiagonal(int[][] array, int number){
        if (is2DArrayCorrect(array)) {
            fillInLeftDiagonal(array, number);
            filInRightDiagonal(array, number);
        }
        return array;
    }

    public static boolean isMatrixSquare(int[][] array) {
        int x = array.length;
        int y = array[0].length;
        if (x == y) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean is2DArrayCorrect(int[][] array){
        try {
            int x = array.length;
            int y = array[0].length;
            if (x >= 1 && y >= 1) {
                return true;
            } else {
                System.out.println("Number of column is = '0'");
                return false;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please enter correct array : number of row must be more than '0'");
        }
        return false;
    }

}
