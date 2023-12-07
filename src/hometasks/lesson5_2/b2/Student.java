package hometasks.nesterovich5_2.b2;

public class Student {
    String name;
    String surname;
    int age;
    int group;
    int averageMark;

    public Student(String name, String surname, int age, int group, int averageMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.group = group;
        this.averageMark = averageMark;
    }

    public void printInformation() {
        System.out.println("Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", group=" + group +
                ", averageMark=" + averageMark +
                '}');
    }
}

