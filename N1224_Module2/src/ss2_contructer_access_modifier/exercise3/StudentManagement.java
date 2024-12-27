package ss2_contructer_access_modifier.exercise3;

import javax.sound.midi.Soundbank;

public class StudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Nguyen Van A", 9.9);

        System.out.println("===========Thong tin ban dau===========");
        System.out.println("ID : " + s1.getId());
        System.out.println("Name : " + s1.getName());
        System.out.println("Score : " + s1.getScore());

        s1.setName("Nguyen Van B");
        s1.setScore(10);

        System.out.println("===========Thong tin sau khi cap nhap===========");
        System.out.println("ID : " + s1.getId());
        System.out.println("Name : " + s1.getName());
        System.out.println("Score : " + s1.getScore());

        s1.setName("");
        s1.setScore(101);

    }
}
