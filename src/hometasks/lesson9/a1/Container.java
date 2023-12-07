package hometasks.lesson9.a1;

public class Container<T> {
    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public static <T> void print(T objectForPrint) {
        System.out.println(objectForPrint);
    }
}