package arrays.TwoDimensionalArray;

import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(10);
        b.add(20);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(10);

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(d);

        // Printing the arraylist
        System.out.println("Printing Using Single Loop: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
        
        // Getting specific element
        System.out.println("Getting Individual Element: ");
        System.out.println(arr.get(1).get(1));
        
        // using loop for printing
        System.out.println("Printing Using Nested Loop: ");
        for (int i = 0; i < arr.size(); i++) {
            List<Integer> x = arr.get(i);
            for (int j = 0; j < x.size(); j++) {
                System.out.print(x.get(j) + " ");
            }
            System.out.println();
        }
    }
}
