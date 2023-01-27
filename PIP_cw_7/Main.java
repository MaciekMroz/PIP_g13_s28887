public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.firstName = "Maciej";
        student1.lastName = "Mróz";
        student1.studentNumber = 28887;

        Student student2 = new Student();
        student2.firstName = "Piotr";
        student2.lastName = "Nowak";
        student2.studentNumber = 27012023;

        System.out.println("Student 1: " + student1.firstName + "; " + student1.lastName + "; " + student1.studentNumber + ";");
        System.out.println("Student 2: " + student2.firstName + "; " + student2.lastName + "; " + student2.studentNumber + ";");

        SecretStudent secretStudent1 = new SecretStudent();
        secretStudent1.readFromScanner();
        secretStudent1.print();

        SecretStudent secretStudent2 = new SecretStudent();
        secretStudent2.readFromScanner();
        secretStudent2.print();
    }
}
