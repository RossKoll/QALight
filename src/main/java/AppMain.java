import org.jetbrains.annotations.NotNull;

public class AppMain {

    public static void main(String[] args) {

        Adult father = new Adult();
        father.sayHello("Ross");
        father.setMyAge(33);

        printAge(father);

    }

    static void printAge(@NotNull Human one){
        System.out.println(one.getMyAge());
    }

    //some Comment
}
