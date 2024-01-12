package hometasks.lesson10.b;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MyHashSet<T> implements Set<T> {
    private transient HashMap<T, Object> map;
    private static final Object PRESENT = new Object();

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean add(T t) {
        return map.put(t, PRESENT) == null;
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public boolean remove(Object o) {
        return map.remove(o) == PRESENT;
    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
    }

    @Override
    public String toString() {
        return "MyHashSet{" +
                "map=" + map +
                '}';
    }
}
/*Создать класс MyHashSet с имплементацией интерфейса Set<T>. Не
использовать реализацию HashSet из JDK, но можно подсмотреть в
неё!
Реализовать методы:
toString()
size()
isEmpty()
add(T e)
remove(Object o)
contains(Object o)*/