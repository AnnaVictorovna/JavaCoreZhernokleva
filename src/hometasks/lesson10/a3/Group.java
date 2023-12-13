package hometasks.lesson10.a3;

import java.util.ArrayList;
import java.util.List;

public class Group {
    int numberOfGroup;

    List<Student> students = new ArrayList<>();

    public Group(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;

    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public String toString() {
        return "Group{" +
                "numberOfGroup=" + numberOfGroup +
                ", students=" + students +
                '}';
    }
}
