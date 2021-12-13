public class Greeting{

    public static void main(String[] args){
        
        Greet greetObject = new Greet();
        /**
         * 1. Memory allocation
         * 2. Default Initialization
         * 3. Constructor execution
         */

        greetObject.greet();
    }
}

class Greet{

    String name;
    int age;
    double salary;

    public void greet() {
        System.out.println("Hello World");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}


/**
 * Identifier naming conventions in Java
 * 
 * Rules: No keywords are allowed as identifiers. Names are case sensitive. Should not start with
 * numbers. Names cannot have whitespaces. Aloowed special characters are: $, _,
 * 
 * Conventions: 1. Names should be meaningful. 2. Class names must be in camel case.
 * TrainingManagerDetails, StudentDetails, EmployeeDetails 3. Variable and method names must be in
 * pascal case. registerUserForNotification
 * 
 * Access specifiers [public, private, protected] Access modifiers [static, final, abstract,
 * synchronized, transient, volatile]
 * 
 * Creating a class in Java
 * 
 * <access specifier> <access modifier> class <class name>{
 * 
 * }
 * 
 * <access specifier> <access modifier> <return type> <method name>(<arguments>){
 * 
 * }
 * 
 * main method is the entry point of the program.
 * structure of the main method
 *  
 *  public static void main(String[] args){
 * 
 *  }
 * 
 * Datatypes in Java
 * 
 * byte - 8 bit
 * short - 16 bit
 * int - 32 bit
 * long - 64 bit
 * 
 * float - 32 bit
 * double - 64 bit
 * 
 * char - 16 bit
 * 
 * boolean - true or false
 * 
 * String
 */
