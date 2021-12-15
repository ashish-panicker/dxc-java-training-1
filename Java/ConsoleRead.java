public class ConsoleRead {

    public static void main(String[] args) {

        String userName = "";
        String password = "";
        int pin = 0;

        System.out.println("Enter your username: ");
        userName = System.console().readLine();

        System.out.println("Enter your password: ");
        password = String.copyValueOf(System.console().readPassword());

        System.out.println("Enter your pin: ");
        pin = Integer.parseInt(System.console().readLine());

        System.out.printf("Your username is %s and password is %s and your pin is %d \n", userName, password, pin);
    }

}
