import java.util.Scanner;

public class Application {
	
    public static void main(String[] args) {
    	
    	// Create scanner
    	Scanner scanner = new Scanner(System.in);
    	
    	// Initialize variables
    	String operation = "";
    	double num1 = 0;
    	double num2 = 0;
    	
    	// If there are arguments use those for the operations, and if not ask the user using the command line what operation they want to do
        if (args.length > 0) {
            // Process CLI arguments
        	operation = args[0];
        } else {
        	
            // No CLI arguments, ask for user input
            System.out.println("Enter operation (e.g., add, subtract, multiply, divide, factorial):");
            operation = scanner.next();
        }
        
        // Switch case for all the possible operations that we are willing to do
        switch (operation.toLowerCase()) {
        case "add":
            System.out.println("Enter the first operand:");
            num1 = scanner.nextDouble();
            System.out.println("Enter the second operand:");
            num2 = scanner.nextDouble();
            System.out.println("Result: " + add(num1, num2));
            break;
        case "factorial":
            System.out.println("Enter a number:");
            double number = scanner.nextDouble();
            System.out.println("Result: " + factorial(number));
            break;
        case "sub":
        	System.out.println("Enter the first operand:");
            num1 = scanner.nextDouble();
            System.out.println("Enter the second operand:");
            num2 = scanner.nextDouble();
            System.out.println("Result: " + sub(num1, num2));
            break;
        case "multiply":
        	System.out.println("Enter the first operand:");
            num1 = scanner.nextDouble();
            System.out.println("Enter the second operand:");
            num2 = scanner.nextDouble();
            System.out.println("Result: " + multiply(num1, num2));
            break;
        case "divide":
        	System.out.println("Enter the first operand:");
            num1 = scanner.nextDouble();
            System.out.println("Enter the second operand:");
            num2 = scanner.nextDouble();
            
            // Error checking
            if (num2 == 0) {
            	System.out.println("Can't divide by 0!");
            } else {
            	System.out.println("Result: " + divide(num1, num2));
                break;
            }
            
        }        
        
    }
    
    
    // Method to add two numbers "a" and "b" and return the result
    public static double add(double a, double b) {
        return a + b;
    }
    
    // Method to sub two numbers "a" and "b" and return the result
    public static double sub(double a, double b) {
        return a - b;
    }
    
    // Method to multiply two numbers "a" and "b" and return the result
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    // Method to divide two numbers "a" and "b" and return the result
    public static double divide(double a, double b) {
    	return a / b;
    }
    
    // Method to find the factorial of a number "n" and return the result
    public static double factorial(double n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
}