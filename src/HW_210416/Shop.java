package HW_210416;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> productList = new ArrayList<>();

    //Поиск индекса по id
    private int searchId (int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    //добавление нового продукта
    public void addProduct (int id, String name, int price) {
        if (searchId(id) < 0) {
            productList.add(new Product(id, name, price));
        }
    }

    //Получение всех товаров
    public ArrayList<Product> getAll () {
        ArrayList<Product> getProductList = new ArrayList<>();
        for (Product product : productList) {
            getProductList.add(product);
        }
        return getProductList;
    }

    //Печать списка продуктов
    public void printProducts (ArrayList<Product> list) {
        for (Product product : list) {
            System.out.println(product.toString());
        }
    }
}
