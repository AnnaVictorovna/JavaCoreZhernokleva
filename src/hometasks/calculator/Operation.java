package hometasks.calculator;

public interface Operation<T> {
    default T addition(T double1, T double2) {
        return null;
    }

    default Double subtraction(Double double1, Double double2) {
        return double1 - double2;
    }

    default Double multiplication(Double double1, Double double2) {
        return double1 * double2;
    }

    default Double division(Double double1, Double double2) {
        return double1 / double2;
    }
}
/*3. Создайте интерфейс Operation с четырьмя методами для
сложения, вычитания, умножения, деления значений. Каждый
метод на вход должен принимать один параметр с типом
Scalar, Vector, Matrix и возвращать результат вычисления.*/