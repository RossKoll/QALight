package homework_robots;

import java.util.ArrayList;
import java.util.Random;

import static homework_robots.AppMain.activeRobot;
import static homework_robots.AppMain.continueLoop;
import static homework_robots.Menu.getNameFromConsole;

public class Robot {

    private String name;
    private int health = 100;
    public String alphabet = "RWEASDZXC";
    private ArrayList<String> damageLetters;
    private ArrayList<String> alreadyUsed = new ArrayList<>();
    private boolean alreadyShot = false;

    public boolean isAlreadyShot() {
        return alreadyShot;
    }

    public void setAlreadyShot(boolean alreadyShot) {
        this.alreadyShot = alreadyShot;
    }

    public Robot(String name) {
        this.name = name;
        this.damageLetters = setRandomKeys();
        //this.damageLetters = setRandomKeys();
    }


    public ArrayList<String> getDamageLetters() {
        return damageLetters;
    }


    public ArrayList<String> getAlreadyUsed() {
        return alreadyUsed;
    }


    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public static String setNameForRobot(int robotNumber) {
        System.out.println("Enter robot " + robotNumber + " name : ");
        String name = getNameFromConsole();
        return name;
    }

    ArrayList<String> setRandomKeys() {
        ArrayList<String> tempArray = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            tempArray.add(getRandomKey());
        }
        return tempArray;
    }


    String getRandomKey() {
        int randIdx = new Random().nextInt(alphabet.length());
        char randChar = alphabet.charAt(randIdx);
        alphabet = alphabet.replace(String.valueOf(randChar), "");
        String temp = Character.toString(randChar);
        return temp;
    }

    public void showDemageLetter() {
        for (int i = 0; i < damageLetters.size(); i++) {
            System.out.print(damageLetters.get(i));
        }
    }

    public void addToAlreadyUsedList(String letter) {
        alreadyUsed.add(letter);
    }

    public void analyzeLetter(String letter) {
        String tempLetter = letter.toString();
        if (this.alreadyUsed.contains(tempLetter)) {
            System.out.println(String.format("Letter %s was already used", letter));
        } else if (this.damageLetters.contains(tempLetter)) {
            System.out.println(String.format("Great shot. %s health decreased by -20", activeRobot.getName()));
            health = health - 20;
            removeDamageLetterAfterUse(this, tempLetter);
        } else {
            System.out.println("Letter does not damage");
        }
    }

    private void removeDamageLetterAfterUse(Robot robot, String letter) {
        robot.damageLetters.remove(letter);
        robot.alreadyUsed.add(letter);
    }

    public static void checkHeals(Robot robot){
        if (robot.getHealth() <= 0){
            System.out.println("Robot " + robot.getName() + " is Killed");
            continueLoop = false;
        }
    }


}
