package hometasks.lesson10.a3;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Student kolya = new Student("Kolya", 8.6);
        Student masha = new Student("masha", 8.9);
        Student stas = new Student("stas", 8.0);

        Student peter = new Student("peter", 7.0);
        Student igor = new Student("igor", 9.1);
        Student natasha = new Student("natasha", 6.0);

        Student grisha = new Student("grisha", 8.8);
        Student polya = new Student("polya", 9.0);
        Student anya = new Student("anya", 8.4);


        List<Student> students1 = new ArrayList<>();
        students1.add(kolya);
        students1.add(masha);
        students1.add(stas);

        List<Student> students2 = new ArrayList<>();

        List<Group> groups = new ArrayList<>();


//        Group oneGroup = new Group(1,);
//        University bstu = new University("BSTU", )

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