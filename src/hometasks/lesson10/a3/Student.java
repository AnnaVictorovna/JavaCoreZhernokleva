package hometasks.lesson10.a3;

public class Student {
    String name; // все поля классов должны быть c модификатором доступа private
    double averageMark;

    public Student(String name, double averageMark) {
        this.name = name;
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return Tab.T6.getString() + "Student{" +
                "name='" + name + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }
}

