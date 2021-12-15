package exceptions;

public class TestException {

    public static void main(String[] args) {

        int number1 = 0;

        int number2 = 0;

        // parse exceptions
        try {
            number1 = Integer.parseInt(args[0]);
            number2 = Integer.parseInt(args[1]);
            System.out.println(number1 + " / by " + number2 + " = " + (number1 / number2));
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException nfe) {
            System.err.println("Invalid details provided: " + nfe.getMessage() + " "
                    + nfe.getClass().getName());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }


    }

}
