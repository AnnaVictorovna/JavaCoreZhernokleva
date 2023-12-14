package hometasks.lesson10.a3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    double averageMark;
    static List<Double> marks = new ArrayList<>();

    public Student(String name, double averageMark) {
        this.name = name;
        this.averageMark = averageMark;
        marks.add(averageMark);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }
}

