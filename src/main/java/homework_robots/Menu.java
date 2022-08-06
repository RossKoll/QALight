package homework_robots;

import java.util.Scanner;

public class Menu {

    public static String getSymbolFromConsole(){
        Scanner scanner = new Scanner(System.in);
        try {
            //if
            return scanner.next().toUpperCase().substring(0,1);
        }catch (Exception e){
            return "e" + e;
        }
    }

    public static String getNameFromConsole(){
        Scanner scanner = new Scanner(System.in);
        try {
            //if
            return scanner.next();
        }catch (Exception e){
            return "e" + e;
        }
    }


}
