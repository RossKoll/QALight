package homework_robots;


import static homework_robots.MainMenu.printMainMenu;
import static homework_robots.Menu.getSymbolFromConsole;
import static homework_robots.Robot.checkHeals;
import static homework_robots.Robot.setNameForRobot;

public class AppMain {
    final static String allLetters = "RWEASDZXC";
    static boolean continueLoop = true;
    static Robot activeRobot;

    public static void main(String[] args) {

        final String EXIT_LATTER = "Q";
        String activeLetter;
        ;

        Robot robot1 = new Robot(setNameForRobot(1));
        Robot robot2 = new Robot(setNameForRobot(2));
        System.out.println(robot1.getDamageLetters());


        activeRobot = robot1;

        do {

            boolean stayOnSameRobot;
            do {
                stayOnSameRobot = false;
                printMainMenu();
                activeLetter = getSymbolFromConsole();

                if (activeLetter.equals(EXIT_LATTER)) {
                    continueLoop = false;
                } else if (allLetters.contains(activeLetter)) {
                    activeRobot.analyzeLetter(activeLetter);
                } else {
                    System.out.println("Wrong letter entered");
                    stayOnSameRobot = true;
                }
            }while (stayOnSameRobot);

            checkHeals(activeRobot);
            activeRobot.setAlreadyShot(true);

            if (activeRobot.getHealth() <= 0){
                if (activeRobot == robot1) {
                    activeRobot = robot2;
                } else activeRobot = robot1;
                System.out.println(String.format("Robot %s is Winner", activeRobot.getName()));
            }

            if (activeRobot == robot1) {
                activeRobot = robot2;
            } else activeRobot = robot1;

            if ((robot1.isAlreadyShot() && robot2.isAlreadyShot()) && (robot1.getHealth()>0 && robot2.getHealth() > 0)) {
                System.out.println(String.format("Robot : %s health is : %d", robot1.getName(), robot1.getHealth()));
                System.out.println(String.format("Robot : %s health is : %d", robot2.getName(), robot2.getHealth()));
            }
        } while (continueLoop);

    }

}
