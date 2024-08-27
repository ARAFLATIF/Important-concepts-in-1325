//BASIC INPUT VALIDATION

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        while (true) {
            System.out.print("Enter your age: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age >= 0 && age <= 120) {
                    break;
                } else {
                    System.out.println("Please enter a valid age between 0 and 120.");
                }
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        System.out.println("Your age is: " + age);
        scanner.close();
    }
}

//This example validates that the user enters a valid integer for age between 0 and 120.

//String validation using regular expressions:

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;

        while (true) {
            System.out.print("Enter your email: ");
            email = scanner.nextLine();
            if (isValidEmail(email)) {
                break;
            } else {
                System.out.println("Please enter a valid email address.");
            }
        }

        System.out.println("Your email is: " + email);
        scanner.close();
    }

    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }
}

//This example validates an email address using a regular expression.

//Custom validation for a class:

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws IllegalArgumentException {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120");
        }
        this.name = name;
        this.age = age;
    }

    // Getters and setters
}

public class PersonValidation {
    public static void main(String[] args) {
        try {
            Person person1 = new Person("John Doe", 30);
            System.out.println("Person created successfully");

            Person person2 = new Person("", 150); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
    }
}

/*This example shows how to implement validation within a class constructor.
These examples demonstrate different approaches to data validation in Java:
Using conditional statements to check input validity.
Using regular expressions for pattern matching.
Implementing validation logic within class constructors or methods.
Remember, the key to effective data validation is to:
Check for null values
Validate data types
Ensure values are within expected ranges
Use appropriate error handling (e.g., exceptions or error messages)
Consider using built-in Java validation libraries or frameworks for more complex validation scenarios.*/
