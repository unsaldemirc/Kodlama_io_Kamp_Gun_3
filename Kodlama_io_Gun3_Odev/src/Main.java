public class Main {

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.id = (001);
        studentManager.FirstName = ("Ali");
        studentManager.LastName = ("Yılmaz");
        studentManager.ClassChar = ('C');
        studentManager.Phone = ("101010101");

        System.out.println("Kullanıcı Numarası => \t " + studentManager.id);
        System.out.println("Kullanıcı'nın Adı => \t " +studentManager.FirstName);
        System.out.println("Kullanıcı'nın Soyadı => \t " +studentManager.LastName);
        System.out.println("Kullanıcı'nın Sınıfı => \t " +studentManager.ClassChar);
        System.out.println("Kullanıcı'nın Nuamrası => \t " +studentManager.Phone);
    }
}
