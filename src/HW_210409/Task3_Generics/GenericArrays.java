package HW_210409.Task3_Generics;

public class GenericArrays<T> {
    private T[] genericArray;

    public GenericArrays(T[] array) {
        genericArray = array;
    }

    public T arrayObject(int index) {
        return genericArray[index];
    }
}
