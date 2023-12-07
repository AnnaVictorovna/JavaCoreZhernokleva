package hometasks.lesson7.a2;

public class Run {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        parrot.say();
        Parrot parrot1 = new Parrot() {
            @Override
            public void say() {
                System.out.println("Этот попугай умеет говорить");
            }
        };
        parrot1.say();
    }
}
/*Создайте класс Parrot и реализуйте в нём метод say(), который
выводит в консоль информацию о том, что попугаи не умеют говорить.
Создайте класс Run и в методе main создайте объект анонимного
класса, который покажет, что данный попугай умеет говорить.*/