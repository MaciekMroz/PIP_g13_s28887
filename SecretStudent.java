import java.util.Scanner;

public class SecretStudent {
    private String name = "Jan";
    private String surname = "Kowalski";
    private int studentNumber = 123;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (newName.isEmpty()) {
            return;
        }
        name = newName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String newSurname) {
        if (newSurname.isEmpty()) {
            return;
        }
        surname = newSurname;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int newStudentNumber) {
        if (newStudentNumber <= 0) {
            return;
        }
        studentNumber = newStudentNumber;
    }

    public void readFromScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie studenta:");
        String newName = scanner.nextLine();
        if(newName.isEmpty()) {
            newName = this.name;
        }
        setName(newName);
        System.out.println("Podaj nazwisko studenta:");
        String newSurname = scanner.nextLine();
        if(newSurname.isEmpty()) {
            newSurname = this.surname;
        }
        setSurname(newSurname);
        int newStudentNumber = 0;
        while (newStudentNumber <= 0) {
            System.out.println("Podaj numer studenta:");
            try {
                newStudentNumber = Integer.parseInt(scanner.nextLine());
                if (newStudentNumber <= 0) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException e) {
                newStudentNumber = this.studentNumber;
            }
        }
        setStudentNumber(newStudentNumber);
    }

    public void print() {
        System.out.println("Imie: " + getName() + " Nazwisko: " + getSurname() + " Numer studenta: " + getStudentNumber());
    }
}