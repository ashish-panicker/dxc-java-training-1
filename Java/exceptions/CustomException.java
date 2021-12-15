package exceptions;

public class CustomException {

    public static void main(String[] args) {

        Voter arun = new Voter(12, "Arun");
        try {
            System.out.println(CheckEligibity.checkEligibity(arun));
        } catch (InvalidVoterException e) {
            System.err.println(e.getMessage());
        }
    }
}


class CheckEligibity {

    public static boolean checkEligibity(Voter voter) throws InvalidVoterException {
        if (voter.getAge() >= 18) {
            return true;
        } else {
            throw new InvalidVoterException(
                    "Voter " + voter.getName() + " is not eligible to vote at this time.");
        }
    }
}


class InvalidVoterException extends Exception {

    public InvalidVoterException(String message) {
        super(message);
    }
}


class Voter {

    private int age;

    private String name;

    public Voter(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
