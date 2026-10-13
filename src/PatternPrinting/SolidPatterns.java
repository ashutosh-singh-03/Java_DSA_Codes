package PatternPrinting;

public class SolidPatterns {
    public static void solidSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void solidRectangle(int length, int width) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void solidTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void solidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void reverseRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void solidPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void solidInvertedPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * n - 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void solidDiamond(int n) {
        n = (int) Math.ceil((double) n / 2);
        solidPyramid(n);
        // Inverted Pyramid
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void solidButterfly(int n) {
        // Solid Right Triangle
        for (int i = 1; i <= n; i++) {
            upperPart(n, i);
            System.out.print("  ".repeat(2 * (n - i)));
            upperPart(n, i);
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            lowerPart(n, i);
            System.out.print("  ".repeat(2 * (i - 1)));
            lowerPart(n, i);
            System.out.println();
        }
    }

    public static void solidSandClock(int n) {
        solidInvertedPyramid(n);
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("== Square ==");
        solidSquare(4);
        System.out.println("== Rectangle ==");
        solidRectangle(3, 5);
        System.out.println("== Triangle ==");
        solidTriangle(5);
        System.out.println("== Rhombus ==");
        solidRhombus(5);
        System.out.println("== Reverse Right Triangle ==");
        reverseRightTriangle(5);
        System.out.println("== Pyramid ==");
        solidPyramid(5);
        System.out.println("== Inverted Pyramid ==");
        solidInvertedPyramid(5);
        System.out.println("== Diamond ==");
        solidDiamond(7);
        System.out.println("== Butterfly ==");
        solidButterfly(4);
        System.out.println("== Sand Clock ==");
        solidSandClock(5);
    }

    public static void upperPart(int n, int i) {
        System.out.print("* ".repeat(i));
    }

    public static void lowerPart(int n, int i) {
        System.out.print("* ".repeat(n - i + 1));
    }
}
