package homework_robots;

import static homework_robots.AppMain.activeRobot;

public class MainMenu extends Menu{


    public static void printMainMenu(){
        System.out.println(" ");
        System.out.println("For Exit press 'Q'");
        System.out.println("A shot at robot : " + activeRobot.getName());
        System.out.println("Your step : press any key (RWEASDZXC)");
    }

}
