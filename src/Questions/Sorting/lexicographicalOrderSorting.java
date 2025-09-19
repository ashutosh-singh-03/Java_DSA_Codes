package Questions.Sorting;

//Sort the string array in lexicographical order using selection sort
public class lexicographicalOrderSorting {
    public static void sortLexical(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min_index]) < 0) min_index = j;
            }
            String temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        for (String val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        String[] arr = {"papaya", "lime", "watermelon", "apple", "mango", "kiwi"};

        sortLexical(arr);
    }
}