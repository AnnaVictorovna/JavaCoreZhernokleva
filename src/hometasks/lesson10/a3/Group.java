package hometasks.lesson10.a3;

import java.util.ArrayList;
import java.util.List;

public class Group {
    int numberOfGroup;
    List<Student> students = new ArrayList<>();

    public Group(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;

    }

    public Student addStudent(Student student) {
        this.students.add(student);
        return student;
    }

    @Override
    public String toString() {
        return "\n\t\t\t\tGroup{" +
                "numberOfGroup=" + numberOfGroup +
                "\n\t\t\t\t\t students=" + students +
                "\n\t\t\t\t}";
    }
}
