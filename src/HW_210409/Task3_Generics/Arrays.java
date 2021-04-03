package HW_210409.Task3_Generics;

public class Arrays<T> {
    private T[] Array;

    public Arrays(T[] array) {
        Array = array;
    }

    public T arrayObject(int index) {
        return Array[index];
    }
}
