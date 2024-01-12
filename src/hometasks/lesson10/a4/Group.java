package hometasks.lesson10.a4;

import hometasks.lesson10.a3.Tab;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public String toString() {
        return Tab.T4.getString() + "Group{" +
                Tab.T5.getString() + " students=" + students +
                Tab.T4.getString() + "}";
    }
}
/*Создать класс Dean, в котором в методе main декан будет проверять
успеваемость группы студентов своего факультета. Для этого создайте
объект Group и заполните его поля, должно быть минимум 20 человек
в группе. Средний балл студенту нужно задать в диапазоне от 4 до 10
с помощью генератора случайных чисел. Далее декану нужно
сформировать список тех, у кого средний балл 6 и выше, чтобы он
знал кому давать стипендию. Для этого с помощью итератора нужно
перебрать список группы и удалить из списка всех у кого балл ниже 6.
вывести на консоль список всей группы (с оценками) и на следующей
строке имена тех, кому дадут стипендию.*/