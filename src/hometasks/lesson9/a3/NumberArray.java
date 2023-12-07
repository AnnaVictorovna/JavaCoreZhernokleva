package hometasks.lesson9.a3;

public class NumberArray<T> {
    private final int arrayLength = 5;
    Number[] array = new Number[arrayLength];

    public Number getElement(int arrayElement) {
        return array[arrayElement];
    }

    public void setElement(int arrayElement, Number number) {
        array[arrayElement] = number;
    }

    public void printArray() {
        for (int i = 0; i < arrayLength; i++) {
            System.out.println(array[i]);
        }
    }
}