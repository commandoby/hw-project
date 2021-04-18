package HW_210416;

import HW_210416.Exceptions.InvalidCommandException;
import HW_210416.Exceptions.InvalidIDException;

import java.util.ArrayList;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {
        //Обязательная программа
        /*try {
            Shop shop = new Shop();
            shop.addProduct(4521, "See Fesh", 760);
            shop.addProduct(5442, "Pig Meat", 1150);
            shop.addProduct(6115, "Bread", 152);
            shop.addProduct(4248, "Juice", 342);
            shop.addProduct(3501, "Eggs", 248);
            ArrayList<Product> products = shop.sortProduct(1, shop.getAll());
            System.out.println("Сортировка продуктов по цене по возрастанию:");
            shop.printProducts(products);
            products.clear();
            shop.removeProduct(4248);
            products = shop.sortProduct(3, shop.getAll());
            System.out.println("Сортировка по добавлению:");
            shop.printProducts(products);
            products.clear();
            shop.changeProduct(4521, "Sea Fish", 765);
            System.out.println("Товары в магазине:");
            Iterator<Product> iterator = shop.getAll().iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next().toString());
            }
        } catch (InvalidIDException e) {
            System.out.println(e.getMessage());
        }*/

        ApplicationMenu menu = new ApplicationMenu();
        try {
            menu.shop.addProduct(4521, "See Fish", 760);
            menu.shop.addProduct(5442, "Pig Meat", 1150);
            menu.shop.addProduct(6115, "Bread", 152);
            menu.shop.addProduct(4248, "Juice", 342);
            menu.shop.addProduct(3501, "Eggs", 248);
        } catch (InvalidIDException e) {
            System.out.println(e.getMessage());
        }
        while (menu.isStartActive()) {
            try {
                menu.start();
            } catch (InvalidCommandException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
