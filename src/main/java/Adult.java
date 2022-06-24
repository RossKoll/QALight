import lombok.Data;
import lombok.Setter;


public class Adult extends Human{



    private String myName;
    private int myAge;

    public void sayHello(String  name){
        System.out.println(String.format("Hello %s", name));
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public int getMyAge() {
        return myAge;
    }
}
