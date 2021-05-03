package HW_210507.LambdaExpressions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Application {
    public static void main(String[] args) {
        //лямбда для печати
        Consumer<ArrayList<String[]>> printer = strings -> {
            for (String[] s : strings) {
                for (String word : s) {
                    System.out.print(" " + word);
                }
                System.out.println();
            }
        };

        //создание строк
        ArrayList<String[]> stringList = new ArrayList<>();
        stringList.add(new String[] {"alpha", "beta", "gamma"});
        stringList.add(new String[] {"application"});
        stringList.add(new String[] {"A", "B", "C", "D", "E"});

        //сортировка по возрастанию
        stringList.sort((o1, o2) -> o1.length - o2.length);
        printer.accept(stringList);
        System.out.println();

        //сортировка по убыванию
        stringList.sort((o1, o2) -> o2.length - o1.length);
        printer.accept(stringList);
    }
}
