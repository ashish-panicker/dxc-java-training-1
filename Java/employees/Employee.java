package employees;
public class Employee {

    private String employeeId;
    private String name;
    private double salary;
    private String department;

    public Employee() {
        System.out.println("\n\nEmployee() constructor....");
    }

    public Employee(String employeeId, String name, double salary, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String print(){
        return "Employee [employeeId=" + getEmployeeId()
                + ", name=" + getName() + ", salary=" + getSalary() + ", department="
                + getDepartment() + "]";
    }
}
