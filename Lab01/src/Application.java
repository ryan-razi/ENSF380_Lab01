import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		
	    Scanner scanner = new Scanner(System.in);
	    
	    while (true) {
	        System.out.println("\nEnter operation (add, subtract, multiply, divide, pow, sqrt, log, log10, sin, cos, tan, factorial, permutation) or 'exit' to quit:");
	        String operation = scanner.next();
	        
	        if (operation.equalsIgnoreCase("exit")) {
	            System.out.println("Exiting calculator...");
	            break;
	        }

	        // For operations requiring two inputs
	        if (!operation.equalsIgnoreCase("sqrt") && !operation.equalsIgnoreCase("log") && !operation.equalsIgnoreCase("log10") && !operation.equalsIgnoreCase("sin") 
	        		&& !operation.equalsIgnoreCase("cos") && !operation.equalsIgnoreCase("tan") && !operation.equalsIgnoreCase("factorial")) {
	            System.out.print("Enter first number: ");
	            double num1 = scanner.nextDouble();
	            System.out.print("Enter second number: ");
	            double num2 = scanner.nextDouble();

	            switch (operation.toLowerCase()) {
	                case "add":
	                    System.out.println("Result: " + add(num1, num2));
	                    break;
	                case "subtract":
	                    System.out.println("Result: " + sub(num1, num2));
	                    break;
	                case "multiply":
	                    System.out.println("Result: " + multiply(num1, num2));
	                    break;
	                case "divide":
	                    System.out.println("Result: " + divide(num1, num2));
	                    break;
	                case "pow":
	                    System.out.println("Result: " + power(num1, num2));
	                    break;
	                case "permutation":
	                    System.out.println("Result: " + perms(num1, num2));
	                    break;
	                default:
	                    System.out.println("Invalid operation.");
	                    break;
	            }
	        } else {
	        	
	            // For operations requiring one input
	            System.out.print("Enter number: ");
	            double num = scanner.nextDouble();

	            switch (operation.toLowerCase()) {
	                case "sqrt":
	                    System.out.println("Result: " + sqrt(num));
	                    break;
	                case "log":
	                    System.out.println("Result: " + log(num));
	                    break;
	                case "log10":
	                    System.out.println("Result: " + log10(num));
	                    break;
	                case "sin":
	                    System.out.println("Result: " + sin(num));
	                    break;
	                case "cos":
	                    System.out.println("Result: " + cos(num));
	                    break;
	                case "tan":
	                    System.out.println("Result: " + tan(num));
	                    break;
	                case "factorial":
	                    // Factorial is a special case requiring an integer
	                    System.out.println("Result: " + factorial((int)num));
	                    break;
	                default:
	                    System.out.println("Invalid operation.");
	                    break;
	            }
	        }
	    }
	    
	    scanner.close();
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
    
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    
    public static double sqrt(double number) {
        return Math.sqrt(number);
    }
    
    public static double log(double number) {
        return Math.log(number);
    }
    
    public static double log10(double number) {
        return Math.log10(number);
    }
    
    public static double sin(double angleRadians) {
        return Math.sin(Math.toRadians(angleRadians));
    }
    
    public static double cos(double angleRadians) {
        return Math.cos(Math.toRadians(angleRadians));
    }
    
    public static double tan(double angleRadians) {
        return Math.tan(Math.toRadians(angleRadians));
    }
    
    public static double perms(double a, double b) {
        
    	// Error checking, and returning NaN ("Not a number") if user inputs something not allowed
    	if (a < 0 || b < 0) {
    		System.out.println("Please enter postitive numbers");
    		return Double.NaN;
    	} else if (a > 100) {
    		System.out.println("Number too large, please try something lower than 100");
    		return Double.NaN;
    	} else if (b > a) {
    		System.out.println("Please enter the larger number first");
    		return Double.NaN;
    	} 
    	
    	// Recursively multiply to find out the number of permutations
    	if (a <= b) {
            return 1;
        } else {
            return a * perms(a - 1, b);
        }
    	
    }
    
}