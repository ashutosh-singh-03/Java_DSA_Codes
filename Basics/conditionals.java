import java.util.Scanner;

public class conditionals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // If-Else: Even-Odd Check
        System.out.print("Enter any positive number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }

        // Checking divisibility by 'm'
        System.out.print("Enter the number to check divisibility for: ");
        int m = sc.nextInt();
        if (num % m == 0) {
            System.out.println(num + " is divisible by " + m);
        } else {
            System.out.println(num + " is not divisible by " + m);
        }

        // Absolute value of an integer
        System.out.print("Enter any integer: ");
        int num1 = sc.nextInt();
        if (num1 < 0) {
            System.out.println("Absolute value: " + (-num1));
        } else {
            System.out.println("Absolute Value: " + num1);
        }

        // Check number of digits
        if (num1 > 99 && num1 < 1000) {
            System.out.println("Number is three digit.");
        } else if (num1 > 0 && num1 < 100) {
            System.out.println("Number is 2 digit.");
        } else {
            System.out.println("Number is not three digit.");
        }

        // Divisibility by 5 or 3
        if (num % 5 == 0 || num % 3 == 0) {
            System.out.println(num + " is divisible.");
        } else {
            System.out.println(num + " is not divisible.");
        }

        // Profit or Loss Calculation
        System.out.print("Enter the Cost Price of the item: ");
        int CP = sc.nextInt();
        System.out.print("Enter the Selling Price of the item: ");
        int SP = sc.nextInt();

        if (CP > SP) {
            System.out.println("Loss.\nLoss Amount: " + (CP - SP));
        } else if (CP == SP) {
            System.out.println("No Profit No Loss.");
        } else {
            System.out.println("Profit.\nProfit Amount: " + (SP - CP));
        }

        // Area vs Perimeter of Rectangle
        System.out.print("Enter the length of rectangle: ");
        int len = sc.nextInt();
        System.out.print("Enter the breadth of rectangle: ");
        int br = sc.nextInt();

        int areaRect = (len * br);
        int perimeterRect = 2 * (len + br);

        if (areaRect > perimeterRect) {
            System.out.println("Area is greater than Perimeter.");
        } else {
            System.out.println("Area is smaller than Perimeter.");
        }

        // Input: Take 3 positive integers and print the greatest and least
        int a, b, c;
        System.out.println("Enter the 3 positive integers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int greatest = a;
        int least = a;

        if (b > greatest)
            greatest = b;
        if (c > greatest)
            greatest = c;

        System.out.println(greatest + " is the greatest.");

        if (b < least)
            least = b;
        if (c < least)
            least = c;

        System.out.println(least + " is the least of all.");

        // Method2: Finding the greatest using nested if
        if (a > b) {
            if (a > c)
                System.out.println(a + " is the greatest.");
            else
                System.out.println(c + " is the greatest.");
        } else {
            if (b > c)
                System.out.println(b + " is the greatest.");
            else
                System.out.println(c + " is greatest.");
        }

        // Taking marks of the students and giving them grades
        System.out.println("Enter the marks of English: ");
        int English = sc.nextInt();
        System.out.println("Enter the marks of Maths: ");
        int Maths = sc.nextInt();
        System.out.println("Enter the marks of Science: ");
        int Science = sc.nextInt();

        int totalMarks = English + Maths + Science;
        int Percentage = ((totalMarks * 100) / 300);

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + Percentage);

        if (Percentage >= 81 && Percentage <= 100)
            System.out.println("Grades: Very Good");
        else if (Percentage >= 61 && Percentage <= 80)
            System.out.println("Grades: Good");
        else if (Percentage >= 41 && Percentage <= 60)
            System.out.println("Grades: Average");
        else
            System.out.println("Grades: Fail");

        // Given a point (x,y), WAP to find if the point lies into 1st, 2nd, 3rd or 4th
        // Quadrant, or on x-axis, y-axis, origin.
        System.out.print("Enter the abscissa: ");
        int x = sc.nextInt();
        System.out.print("Enter the ordinate: ");
        int y = sc.nextInt();

        System.out.println("Coordinate: (" + x + ", " + y + ").");

        if (x == 0 && y > 0)
            System.out.println("Point: Y-Axis");
        else if (x > 0 && y == 0)
            System.out.println("Point: X-Axis");
        else if (x > 0 && y > 0)
            System.out.println("Point: 1st Quadrant");
        else if (x < 0 && y > 0)
            System.out.println("Point: 2nd Quadrant");
        else if (x < 0 && y < 0)
            System.out.println("Point: 3rd Quadrant");
        else if (x > 0 && y < 0)
            System.out.println("Point: 4th Quadrant");
        else
            System.out.println("Point: Origin");

        // Checking if num is even or odd - Ternary Operator
        System.out.println((num % 2 == 0) ? "Even" : "Odd");
        // (num%2==0) ? System.out.println(--):System.out.println(--); --> Not possible
        // in JAVA

        // Taking sides as input and check if they can form a triangle
        System.out.print("Enter Side1: ");
        int side1 = sc.nextInt();
        System.out.print("Enter Side2: ");
        int side2 = sc.nextInt();
        System.out.print("Enter Side3: ");
        int side3 = sc.nextInt();

        if ((side1 + side2) > side3 && (side2 + side3) > side1 && (side1 + side3) > side2)
            System.out.println("Triangle can be formed.");
        else
            System.out.println("Triangle cannot be formed.");

        // Switch Statement: Create a calculator using switch
        System.out.print("Enter 1st Number:");
        int num_1 = sc.nextInt();
        System.out.print("Enter 2nd Number:");
        int num_2 = sc.nextInt();
        System.out.println("Press + for addition.\nPress - for subtraction.\nPress * for Multiplication.\nPress / for division.");

        char choice = sc.next().charAt(0);

        switch (choice) {
            case '+':
                System.out.println(num_1 + num_2);
                break;
            case '-':
                System.out.println(num_1 - num_2);
                break;
            case '*':
                System.out.println(num_1 * num_2);
                break;
            case '/':
                System.out.println(num_1 / num_2);
                break;
            default:
                System.out.println("Choose correct option.");
                break;
        }
    }
}
