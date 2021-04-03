package HW_210409.Task3_Generics;

import HW_210409.Task2_Enum.Alphabet;

public class Main {
    public static void main(String[] args) {
        Arrays<String> Arr1 = new Arrays<>(new String[]{"Ivanov", "Petrov", "Zaiсev", "Sidorov"});
        System.out.println(Arr1.arrayObject(2));
        Arrays<Integer> Arr2 = new Arrays<>(new Integer[]{4, 8, 15, 16, 23, 42});
        System.out.println("The Ultimate Question of Life, the Universe, and Everything - " + Arr2.arrayObject(5));
        Arrays<Alphabet> Arr3 = new Arrays<>(new Alphabet[]{Alphabet.A, Alphabet.I, Alphabet.Q, Alphabet.Y});
        System.out.println("The first letter of the alphabet is " + Arr3.arrayObject(0));
    }
}
