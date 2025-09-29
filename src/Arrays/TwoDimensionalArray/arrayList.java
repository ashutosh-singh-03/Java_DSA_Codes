package Arrays.TwoDimensionalArray;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println(arr);

        System.out.println("Printing Using Single Loop: ");
        for (List<Integer> list : arr) {
            System.out.println(list);
        }

        // Getting specific element
        System.out.println("Getting Individual Element: ");
        System.out.println(arr.get(1).get(1));

        // using loop for each printing
        System.out.println("Printing Using Nested Loop: ");
        for (List<Integer> x : arr) {
            for (Integer num : x) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

//        using for loop
        System.out.println("Printing with for loop: ");
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}