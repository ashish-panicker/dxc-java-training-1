

public class CommandLine {
    
    public static void main(String[] args) {

        // String name = "";

        // name = args[0];

        // System.out.println("Hello " + name);

        int number1 = 0;
        int number2 = 0;

        number1 = Integer.parseInt(args[0]);
        number2 = Integer.parseInt(args[1]);

        System.out.println("Sum of " + number1 + " and " + number2 + " = " + (number1 + number2));

    }
}
