public class firstProgram {
    public static void main(String[] args) {
        System.out.println("Difference between print and println");
        System.out.print("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println();
        System.out.println("VARIABLES AND THEIR DECLARATION");
        int x; // declaration
        x = 6; // initialization
        System.out.println(x);

        System.out.println();
        System.out.println("Variable Value Updation");
        int y = 6;
        System.out.println(y);
        y = y + 90;
        System.out.println(y);

        System.out.println();
        System.out.println("ARITHMETIC OPERATIONS");
        int num1 = 6, num2 = 2;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);

        System.out.println();
        double radius = 5.0;
        System.out.println("Calculating the Area of Circle of radius " + radius);
        double area = 3.14 * radius * radius;
        System.out.println(area);

        System.out.println();
        System.out.println("Calculating volume of Sphere");
        double rad = 5f;
        double volume = (4 * 3.14 * rad * rad * rad) / 3;
        System.out.println("The volume of the sphere of radius " + rad + " is: " + volume);

        System.out.println();
        System.out.println("Finding the Simple Interest:");
        double principal = 10000, rate = 5, time = 5;
        double interest = (principal * rate * time) / 100;
        System.out.println("Interest: " + interest);
    }
}