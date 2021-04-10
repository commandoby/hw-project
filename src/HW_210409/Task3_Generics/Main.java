package HW_210409.Task3_Generics;

import HW_210409.Task2_Enum.Alphabet;

public class Main {
    public static void main(String[] args) {
        GenericArrays<String> array1 = new GenericArrays<>(new String[]{"Ivanov", "Petrov", "Zaiсev", "Sidorov"});
        System.out.println(array1.arrayObject(2));
        GenericArrays<Integer> array2 = new GenericArrays<>(new Integer[]{4, 8, 15, 16, 23, 42});
        System.out.println("The Ultimate Question of Life, the Universe, and Everything - " + array2.arrayObject(5));
        GenericArrays<Alphabet> array3 = new GenericArrays<>(Alphabet.values());
        System.out.println("The first letter of the alphabet is " + array3.arrayObject(0));
    }
}
