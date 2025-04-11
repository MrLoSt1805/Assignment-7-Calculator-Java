# Java Calculator Application

## Description
This is a simple command-line based calculator application written in Java. It supports basic arithmetic operations and a few additional mathematical functionalities.

## Features
- Addition
- Subtraction
- Multiplication
- Division (with zero division exception handling)
- Square
- Cube
- Square Root (with negative input exception handling)

## File Structure
- **Main.java**: Entry point of the application. Demonstrates usage of the calculator functions.
- **Calculator.java**: Contains all calculator functions as methods.

## Exception Handling
- **ArithmeticException** is used for:
  - Division by zero
  - Square root of a negative number
- **Generic Exception**: Catches any other unforeseen issues.

## Usage
Compile all `.java` files and run the `Main` class.

```
javac Main.java Calculator.java
java Main
```

## Author
- **Name**: Daniel John Jacob
- **PRN**: 23070126027
- **Batch**: AIML A2, 2023-27
