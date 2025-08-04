import java.util.Scanner;

public class Q12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the data from index"+i);
            int data = sc.nextInt();
            System.out.print(data);
            arr[i] = data;
        }
        System.out.println("enter the value to search in the array");
        int item = sc.nextInt();
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==item) {
                flag=true;
            }
        }
        if (flag) {
            System.out.println("yes item fround in array");
        }else{
            System.err.println("item not found");
        }
    }
}
