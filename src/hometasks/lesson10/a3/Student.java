package hometasks.lesson10.a3;

public class Student {
    private String name; // все поля классов должны быть c модификатором доступа private
    private double averageMark;

    public double getAverageMark() {
        return averageMark;
    }

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

