package employees;
public class Inheritance {

    public static void main(String[] args) {
        
        Employee e = new Engineer("E001", "John", 1000, "IT", "L001");
        System.out.println(e.print()); // dynamic polymorphism
                                        // virtual method invocation
    }
    
}