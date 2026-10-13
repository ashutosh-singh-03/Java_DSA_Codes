package PatternPrinting;

public class HollowPatterns {
    public static void hollowRectangle(int length, int width) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == length) System.out.print("* ");
                else {
                    if (j == 1 || j == width) System.out.print("* ");
                    else System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hollowRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i <= 2 || i == n) System.out.print("* ");
                else {
                    if (j == 1 || j == i) System.out.print("* ");
                    else System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void hollowPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            if (i == 1 || i == n) {
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");
                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //    Use of Repeat in String
    public static void hollowPyramidWithRepeat(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("  ".repeat(n - i));
            if (i == 1) {
                System.out.print("* ");
            } else if (i == n) {
                System.out.print("* ".repeat(2 * i - 1));
            } else {
                System.out.print("* ");
                System.out.print("  ".repeat(2 * i - 3));
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowDiamond(int n) {
        n = (int) Math.ceil(n / 2.0);
        for (int i = 1; i <= n; i++) {
            printDiamondRow(n, i);
        }
        for (int i = n - 1; i >= 1; i--) {
            printDiamondRow(n, i);
        }
    }

    public static void printDiamondRow(int n, int i) {
        System.out.print("  ".repeat(n - i));
        if (i == 1) System.out.print("* ");
        else {
            System.out.print("* ");
            System.out.print("  ".repeat(2 * i - 3));
            System.out.print("* ");
        }
        System.out.println();
    }

    //    public static void hollow(int n){}
//    public static void hollow(int n){}
    public static void main(String[] args) {
        System.out.println("=== Hollow Rectangle ===");
        hollowRectangle(4, 6);
        System.out.println("=== Hollow Right Triangle ===");
        hollowRightTriangle(5);
        System.out.println("=== Hollow Pyramid ===");
        hollowPyramid(5);
        System.out.println("=== Hollow Pyramid Using Repeat Method ===");
        hollowPyramidWithRepeat(5);
        System.out.println("=== Hollow Diamond ===");
        hollowDiamond(7);
    }
}
