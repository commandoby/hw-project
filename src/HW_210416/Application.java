package HW_210416;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addProduct(4521, "See Feesh", 760);
        shop.addProduct(5442, "Pig Meat", 1150);
        shop.addProduct(6115, "Bread", 152);
        shop.addProduct(4248, "Juce", 341);
        ArrayList<Product> products = shop.sortProduct(3, shop.getAll());
        shop.printProducts(products);
        products.clear();
        shop.changeProduct(4521, "ssss", 99);
        products = shop.sortProduct(3, shop.getAll());
        shop.printProducts(products);
    }
}
