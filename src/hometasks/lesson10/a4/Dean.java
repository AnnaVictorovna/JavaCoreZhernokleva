package hometasks.lesson10.a4;

import java.util.Iterator;
import java.util.Random;

public class Dean {
    static Random random = new Random();

    public static void main(String[] args) {
        Group groupO = new Group();
        fillGroup(groupO);
        System.out.println(groupO);
        findGoodStudents(groupO, 6.0);

    }

    public static void findGoodStudents(Group groupOne, double avgMark) {
        Iterator<Student> studentsIterator = groupOne.getStudents().iterator();
        while (studentsIterator.hasNext()) {
            Student groupOfGoodStudents = studentsIterator.next();
            if (groupOfGoodStudents.getAverageMark() < avgMark) {
                studentsIterator.remove();
            }
        }
        System.out.println(groupOne);
    }

    public static Student generateStudent() {
        String name = "name" + random.nextInt(1, 40);
        return new Student(name, generateMark());
    }

    public static void fillGroup(Group group) {
        for (int i = 0; i < 20; i++) {
            group.addStudent(generateStudent());
        }
    }

    public static double generateMark() {
        return roundMark(random.nextDouble(4, 10));
    }

    public static double roundMark(double mark) {
        return Math.round(mark * 10) / 10.0;
    }

}
/*Создать класс Dean, в котором в методе main декан будет проверять
успеваемость группы студентов. Для этого создайте объект класса
Group и заполните его поля, должно быть минимум 20 человек в
группе. Средний балл студенту нужно задать в диапазоне от 4 до 10 с
помощью генератора случайных чисел. Далее декану нужно
сформировать список тех, у кого средний балл 6 и выше, чтобы он
знал кому давать стипендию. Для этого с помощью итератора нужно
перебрать список группы и удалить из списка всех у кого балл ниже 6.
Вывести на консоль список всей группы (с оценками) и на следующей
строке список тех, кому дадут стипендию.*/