package employees;
public class Engineer extends Employee {

    private String licenseNumber;

    public Engineer() {
        System.out.println("Engineer() constructor....");
    }

    public Engineer(String employeeId, String name, double salary, String department,
            String licenseNumber) {

        super(employeeId, name, salary, department);
        this.licenseNumber = licenseNumber;
    }


    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String print() {
        return "Engineer [licenseNumber=" + licenseNumber + ", employeeId=" + super.getEmployeeId()
                + ", name=" + getName() + ", salary=" + getSalary() + ", department="
                + getDepartment() + "]";
    }

}
