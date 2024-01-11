package hometasks.lesson10.a3;

class Student {
    private String name;
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

