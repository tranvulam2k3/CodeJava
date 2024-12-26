package ss1_java_overview.student_management;

public class Main2 {
    public static void main(String[] args) {
        Student student = new Student();
        student.input();

        Student student2 = new Student(2,"Nguyen B",9.9);
        student2.output();

        student.setId(100);
        System.out.println(student);
    }
}
