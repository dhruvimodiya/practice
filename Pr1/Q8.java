public class Q8 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 11, 12, 13, 14};
        // for (int i = arr.length-1; i >= 0; i--) {
        //     System.out.println("Sum of array elements is: " + arr[i]);
        // }

        int i=0;
        int j= arr.length - 1;

        while (i<=j) {
            arr[j]= arr[i]+arr[j]-(arr[i]=arr[j]);
            i++;
            j--;
        }
        System.out.println("Reversed array elements are: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
