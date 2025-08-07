import java.util.ArrayList;
import java.util.Collections;

public class Q2 {
    public static void main(String[] args){
        ArrayList<Integer> number  = new ArrayList<>();

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);

        System.out.println("number - "+number);

       Collections.reverse(number);

       System.out.println(number);
    }
}
