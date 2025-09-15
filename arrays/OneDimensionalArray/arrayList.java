package Arrays.OneDimensionalArray;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(5);
        // Adding Elements
        arr.add(0, 1);
        arr.add(1, 2);
        arr.add(2, 3);
        arr.add(3, 4);
        arr.add(4, 5);
        System.out.println("Size of the current Array: " + arr.size());

        // Printing the ArrayList
        System.out.println(arr.get(2));
        System.out.println(arr);
        for (int i = 0; i <= 4; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        // Modifying the ArrayList
        arr.set(4, 500);
        System.out.println(arr);

        // Adding Element Exceeding the Capacity will increase the capacity of the array
        arr.add(6);
        System.out.println(arr);
        System.out.println("New Size of the Array: " + arr.size());
    }
}
