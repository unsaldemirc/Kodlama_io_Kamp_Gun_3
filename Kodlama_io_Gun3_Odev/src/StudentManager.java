public class StudentManager extends InstructorManager{
    @Override
    public void add() {
        System.out.println("Öğrenciler eklendi!");
    }

    int id;
    String FirstName;
    String LastName;
    char ClassChar;
    String Phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public char getClassChar() {
        return ClassChar;
    }

    public void setClassChar(char classChar) {
        ClassChar = classChar;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
