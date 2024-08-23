import java.util.Scanner;

public class Lecture_7_Functions {
    // 1 Print given name
    public static void printName (String name) {
        System.out.println("Hi, " + name + "\n");
    }

    // 2 Calculate sum for given two numbers
    public static double calculateSum( double num1, double num2) {
        return num1 + num2 ;
    }

    // 3 Calculate product for given two numbers
    public static double calculateProduct( double num1, double num2) {
        return num1 * num2 ;
    }

    // 4 Calculate factorial
    public static void calculateFactorial(int num) {
        if (num < 0) {
            System.out.println("Invalid number for calculating factorial. Only positive numbers are allowed.");
            return;
        }

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + num + " is: " + factorial);
    }

    // Our main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        printName(name);

        System.out.print("Enter 1st number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter 2nd number: ");
        double num2 = sc.nextDouble();

        System.out.println(num1 + " + " + num2 + " = " + calculateSum(num1, num2));
        System.out.println(num1 + " x " + num2 + " = " + calculateProduct(num1, num2));

        System.out.print("\nEnter a positive number for factorial: ");
        int factorial = sc.nextInt();

        calculateFactorial(factorial);
    }
}
