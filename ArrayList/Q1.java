// Create an ArrayList and print all elements
// Add elements to ArrayList
// Remove an element from ArrayList

import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20); 
        arr.add(30); 
        arr.add(40); 
        arr.add(50); 

        arr.remove(2);

        arr.add(1,500);
        arr.set(3,80);

        Boolean B = arr.isEmpty();
        System.out.println("is empty or not -"+B);

        Integer size = arr.size();
        System.out.println("array size"+size);

        Integer Array = arr.get(1);
        System.out.println("array list" +Array);
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}