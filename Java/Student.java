public class Student {

    public static void main(String[] args) {

        // sequential
        int age = 17;
        String name = "John";
        char gender = 'M';
        char grade = 'B';
        String[] subjects = new String[5];
        subjects[0] = "Mathematicss";
        subjects[1] = "Chemistry";
        subjects[2] = "Biology";
        subjects[3] = "English";
        subjects[4] = "French";

        // print in the format
        // <name> is <gender> and is <age> years old

        System.out.println(name + " is " + gender + " and is " + age + " years old.");
        System.out.println(name + gender + age);

        System.out.println(subjects[0]);
        System.out.println(subjects[1]);
        System.out.println(subjects[2]);
        System.out.println(subjects[3]);
        System.out.println(subjects[4]);
        // conditional execution

        if (age >= 18) {
            // condition is truerno
            System.out.println(name + " is eligible to vote.");
        } else {
            // condition is false
            System.out.println(name + " is not eligible to vote.");
        }

        if (grade == 'A') {
            System.out.println("Excellent!");
        } else if (grade == 'B') {
            System.out.println("Very good!");
        } else if (grade == 'C') {
            System.out.println("Average!");
        } else {
            System.out.println("Poor!");
        }

        // iterative execution
        int index = 1;

        while (index <= 10) { // entry controlled loop
            System.out.println("Hello from while loop....");
            System.out.println(index);
            index = index + 1;
        }
        // index = 11
        do {
            System.out.println("Hello from do while loop....");
            System.out.println(index);
        } while (index <= 10); // exit controlled loop

        System.out.println(subjects.length);

        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i]);
        }

        

    } // end of main method

} // end of class Basics
