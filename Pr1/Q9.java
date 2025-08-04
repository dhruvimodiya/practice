import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the data for index ="+i);
            int data = sc.nextInt();
            arr[i] = data;
        }
        System.out.println("enter the value to search in the array");
        int item = sc.nextInt();
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==item) {
                flag=true;
                break;
            }
        }
        if (flag) {
            System.out.println("yes item found in array");
        }else{
            System.out.println("item not found");
        }
    }
}
