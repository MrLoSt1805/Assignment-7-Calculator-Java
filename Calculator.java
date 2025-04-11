// Calculator.java
public class Calculator {
    // Function to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Function to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Function to multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Function to divide two numbers with exception handling
    public double divide(int a, int b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return (double) a / b;
    }

    // Function to return the square of a number
    public int square(int a) {
        return a * a;
    }

    // Function to return the cube of a number
    public int cube(int a) {
        return a * a * a;
    }

    // Function to return square root with exception for negative numbers
    public double squareRoot(int a) throws ArithmeticException {
        if (a < 0) throw new ArithmeticException("Cannot take square root of negative number");
        return Math.sqrt(a);
    }
}
