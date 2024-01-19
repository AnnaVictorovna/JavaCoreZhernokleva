package hometasks.calculator;

public interface Operation<T> {
     T addition(T double1);

     T subtraction(T double1);

     T multiplication(T double1);

     T division(T double1);
}
/*3. Создайте интерфейс Operation с четырьмя методами для
сложения, вычитания, умножения, деления значений. Каждый
метод на вход должен принимать один параметр с типом
Scalar, Vector, Matrix и возвращать результат вычисления.*/