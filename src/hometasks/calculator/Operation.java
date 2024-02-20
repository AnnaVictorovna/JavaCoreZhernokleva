package hometasks.calculator;

public interface Operation<T> {
     T addition(T double1);

     T subtraction(T double1);

     T multiplication(T double1);

     T division(T double1);
}