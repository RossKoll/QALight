package extraHomeWork2;

public class WorkWithMassive {

    public static void analyzeMassive(int[] massive, int varForComparing) {
        int number = 1;

        if(massive.length == 0){
            System.out.println("Array length is equal : '0'");
        }
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] < varForComparing) {
                System.out.println(number + " : " + massive[i] + " is less than " + varForComparing);

            }
            if (massive[i] == varForComparing) {
                System.out.println(number + " : " + massive[i] + " is equal " + varForComparing);

            }
            if (massive[i] > varForComparing) {
                System.out.println(number + " : " + massive[i] + " is more than " + varForComparing);

            }
            number++;
        }
    }
}
