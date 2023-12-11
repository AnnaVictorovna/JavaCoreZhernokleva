package hometasks.lesson10.a2;

import java.util.ArrayList;
import java.util.List;

public class Class {
    public static void main(String[] args) {
        Student student1 = new Student("kolya", 14);
        Student student2 = new Student("masha", 13);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);

    }
}
