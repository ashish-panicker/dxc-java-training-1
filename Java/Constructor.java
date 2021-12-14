public class Constructor {
    public static void main(String[] args) {
        Learner student = new Learner("John", 20, "New York", "123558", "john.smith");
        student.printDetails();
    }
}

class Learner {

    String name;
    int age;
    String address;
    String phone;
    String email; 
    // global scope

    public Learner(){
        System.out.println("Default constructor");
    }

    public Learner(String name, int age, String address, String phone, String email) {
        this();
        System.out.println("Constructor 2 is called");
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.email = email;
        // local scope
    }

    public void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
        System.out.println("Phone: "+phone);
        System.out.println("Email: "+email);
    }
}
