import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);
         System.out.print("Enter a number: ");
        int number2 = scanner.nextInt();
        System.out.println("You entered: " + number2);

        int sum = number * number2;
        System.out.println("The sum of the two numbers is: " + sum);
    }
}
