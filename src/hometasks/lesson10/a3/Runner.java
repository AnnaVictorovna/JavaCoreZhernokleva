package hometasks.lesson10.a3;

import java.util.List;
import java.util.Random;

public class Runner {
    static Random random = new Random();

    public static void main(String[] args) {
        University university = new University("BSU");
        fillUniversity(university);
//        fillFaculty(university.addFaculty(generateFaculty()));
        System.out.println(university);
        List<Double> allMarksUniversity = university.getAllMarksUniversity();
        System.out.println(allMarksUniversity);
        System.out.println("Средняя оценка по университету = " + calculateAverageMarks(allMarksUniversity));

    }

    public static Student generateStudent() {
        String name = "StudentName" + random.nextInt(1, 30);
        return new Student(name, generateMark());
    }

    public static double generateMark() {
        return roundMark(random.nextDouble(2, 10));
    }

    public static double roundMark(double mark) {
        return Math.round(mark * 10) / 10.0;
    }

    public static Group generateGroup() {
        return new Group(random.nextInt(0, 15));
    }

    public static void fillGroup(Group group) {
        for (int i = 0; i < 3; i++) {
            group.addStudent(generateStudent());
        }
    }

    public static Faculty generateFaculty() {
        String nameOfFaculty = "facultyName" + random.nextInt(0, 10);
        return new Faculty(nameOfFaculty);
    }

    public static void fillFaculty(Faculty faculty) {
        for (int i = 0; i < 3; i++) {
            fillGroup(faculty.addGroup(generateGroup()));
        }
    }

    public static void fillUniversity(University university) {
        for (int i = 0; i < 3; i++) {
            fillFaculty(university.addFaculty(generateFaculty()));
        }
    }

    public static double calculateAverageMarks(List<Double> marks) {
        double sum = 0;
        for (Double mark : marks) {
            sum += mark;
        }
        return roundMark(sum / marks.size());
    }
}
/*Создать класс Student который будет хранить в себе имя и средний
балл студента. Создать класс Group который будет хранить в себе
номер группы и список одногруппников. Создайте класс Faculty
который будет хранить в себе название факультета и список групп
этого факультета. Создайте класс University который будет хранить
в себе название университета и список факультетов. Создайте класс
Runner, в методе main создайте один объект класса University и
заполните все его поля данными (во всех списках должно хранится
минимум 3 объекта). Выведите в консоль средний балл студентов по
университету.*/