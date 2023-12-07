package hometasks.nesterovich5_2.c1;

public class Run {
    public static void main(String[] args) {
        OldPerson oldPerson = new OldPerson();
        YoungPerson youngPerson = new YoungPerson();

        oldPerson.walk();
        youngPerson.walk();
        oldPerson.getPension();
    }
}
/*
Создать классы с полями и методами реализующие принципы
ООП на примере сущности Person.
Требования:
- минимум 1 уровень наследования.
- хотя бы 1 класс потомок должен содержать метод, которого нет у
родительского класса.
- показать пример инкапсуляции.
Создать класс Run и в методе main продемонстрируйте работу
методов классов.
 */
