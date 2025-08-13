public class SecondLarge{
     public static void main(String[] args) {
        int arr[] = {20,42,6,25,30,88};
        int max1 = 0;
        int max2 = 0;

        if (arr[0]>arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        }else{
            max2 = arr[0];
            max1 = arr[1];
        }

        for(int i=2;i<arr.length;i++){
            if (arr[i]>max1) {
                max2 = max1;
                max1 = arr[i];
            }else if (arr[i] > max2) {
                max2 = arr[i];
            }
            System.err.println("large"+max1);
            System.err.println("second large"+max2);
        }
    }
};