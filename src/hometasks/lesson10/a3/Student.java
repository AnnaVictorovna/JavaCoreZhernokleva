package hometasks.lesson10.a3;

public class Student {
    String name;
    double averageMark;

    public Student(String name, double averageMark) {
        this.name = name;
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "\n\t\t\t\t\t\t\t" + "Student{" +
                "name='" + name + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }
}

