package hometasks.lesson10.a3;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private final int numberOfGroup;
    private final List<Student> students = new ArrayList<>();

    public Group(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;

    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public List<Double> getAllMarksGroup() {
        List<Double> marks = new ArrayList<>();
        for (Student student : students) {
            marks.add(student.getAverageMark());
        }
        return marks;
    }

    @Override
    public String toString() {
        return Tab.T4.getString() + "Group{" +
                "numberOfGroup=" + numberOfGroup +
                Tab.T5.getString() + " students=" + students +
                Tab.T4.getString() + "}";
    }
}
