package employees;
public class Accountant extends Employee {

    private String caNumber;

    public Accountant() {
        System.out.println("Accountant() constructor....");
    }

    public String getCaNumber() {
        return caNumber;
    }

    public void setCaNumber(String caNumber) {
        this.caNumber = caNumber;
    }

}
