package hometasks.nesterovich5_2.b2;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Sasha", "Popov", 19, 2, 8);
        Student student2 = new Student("Masha", "Orlova", 20, 11, 7);
        student1.printInformation();
        student2.printInformation();
    }
}
/*
Создайте класс Student с полями: имя, фамилия, возраст, группа,
средний балл. Создайте конструктор для заполнения всех полей
класса. Создайте метод, который будет выводить в консоль всю
информацию о студенте. Продемонстрируйте работу этого метода
на двух объектах класса Student.

 */
