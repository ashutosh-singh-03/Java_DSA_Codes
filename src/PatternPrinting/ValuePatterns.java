package PatternPrinting;

public class ValuePatterns {
    public static void numericalTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void numericalCountTriangle(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    public static void alphabetTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int value = 'E' - 1;
                System.out.print((char) ((value + 2) - j) + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int value = 'A' - 1;
                System.out.print((char) (value + j) + " ");
            }
            System.out.println();
        }
    }

    public static void alphabetTriangleType2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int value = 'A' - 1;
                System.out.print((char) (value + j) + " ");
            }
            System.out.println();
        }
    }

    public static void numberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            int decrementValue = i - 1;
            for (int j = 1; j <= i - 1; j++) {
//                System.out.print(i - j + " "); or
                System.out.print(decrementValue-- + " ");
            }
            System.out.println();
        }
    }

    public static void numberPyramidType2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void alphabetPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' - 1 + j) + " ");
            }
            char ch = (char) (i + 'A' - 2);
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(ch-- + " ");
            }
            System.out.println();
        }
    }

    public static void alphabetPyramidType2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print((char) ('A' - 1 + i) + " ");
            }
            System.out.println();
        }
    }

    public static void main() {
        System.out.println("=== Numerical Triangle ===");
        numericalTriangle(5);
        System.out.println("=== Numerical Count Triangle ===");
        numericalCountTriangle(5);
        System.out.println("=== Alphabetical Triangle ===");
        alphabetTriangle(5);
        System.out.println("=== Alphabetical Triangle Type 2 ===");
        alphabetTriangleType2(5);
        System.out.println("=== Numerical Pyramid ===");
        numberPyramid(4);
        System.out.println("=== Numerical Pyramid Type 2 ===");
        numberPyramidType2(4);
        System.out.println("=== Alphabetical Pyramid ===");
        alphabetPyramid(4);
        System.out.println("=== Alphabetical Pyramid Type 2 ===");
        alphabetPyramidType2(4);
    }
}
