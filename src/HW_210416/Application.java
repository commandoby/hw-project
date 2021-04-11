package HW_210416;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        //Обязательная программа
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
        products = shop.getAll();
        System.out.println("Товары в магазине:");
        shop.printProducts(products);
        System.out.println();
        ApplicationMenu menu = new ApplicationMenu(shop);
        menu.start();
    }
}
