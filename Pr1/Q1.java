import java.util.Scanner;

public class Q1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: "); 
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);
        int sum =0;
        for(int i=0; i<=number;i++){
            System.out.println("number -"+i);
            sum = sum + i;
            System.err.println("sum - " + sum);
        }
    }
}
