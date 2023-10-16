package ie.atu;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        add();
        multiply();
        divide();
        subtract();
    }

    public static void add() {
        System.out.println("Please enter your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second number: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("The total is: " + total);

    }

    public static void multiply()
    {
        System.out.println("Please enter your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second number: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber * secondNumber;

        System.out.println("The multiply of two numbers is: " + total);

    }

public static void divide()
    {
        System.out.println("Please enter your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second number: ");
        int secondNumber = inputs.nextInt();

        int ans = firstNumber / secondNumber;

        System.out.println("The division of the two numbers is: " + ans);
    }

    public static void subtract()
    {
        System.out.println("Please enter your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second number: ");
        int secondNumber = inputs.nextInt();

        int ans = firstNumber - secondNumber;

        System.out.println("The subtraction of the two numbers is: " + ans);
    }
}