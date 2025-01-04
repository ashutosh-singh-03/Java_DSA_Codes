public class firstProgram {
    public static void main(String[] args) {
        // Difference between print and println
        System.out.print("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        // VARIABLES AND THEIR DECLARATION
        int x; // declaration
        x = 6; // initialization
        System.out.println(x);

        // Variable Value Updation
        int y = 6;
        System.out.println(y);
        y = y + 90;
        System.out.println(y);

        // ARITHMETIC OPERATIONS
        int num1 = 6, num2 = 2;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);

        // Area of Circle
        double radius = 5.0;
        double area = 3.14 * radius * radius;
        System.out.println("Area of the circle of radius" + radius + "is: " + area);

        // Volume of Sphere
        double rad = 5;
        double volume = (4 * 3.14 * rad * rad * rad) / 3;
        System.out.println("The volume of the sphere of radius " + rad + " is: " + volume);

        // Simple Interest
        double principal = 10000, rate = 5, time = 5;
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
    }
}