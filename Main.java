// Main.java
// Name: Daniel John Jacob 
// PRN: 23070126027
// Batch: AIML A2, 2023-27

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        try {
            System.out.println("Addition: " + calc.add(10, 5));
            System.out.println("Subtraction: " + calc.subtract(10, 5));
            System.out.println("Multiplication: " + calc.multiply(10, 5));
            System.out.println("Division: " + calc.divide(10, 5));
            System.out.println("Square: " + calc.square(4));
            System.out.println("Cube: " + calc.cube(3));
            System.out.println("Square Root: " + calc.squareRoot(16));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
    }
}
