package PolimorfizmHomework;

public class MektebMain {
    static void main(String[] args) {
        Person student = new Student("Fatima", "Tajiroghlu",22,"Tibb");
        Person teacher = new Teacher("Narmin", "Aliyeva", 28, "Biologiya");

        System.out.println("Telebe melumati: ");
        student.showInfo(student);
        System.out.println("Muellim melumati: ");
        teacher.showInfo(teacher);
    }
}
