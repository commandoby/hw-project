package HW_210416;

import HW_210416.Exceptions.InvalidIDException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Shop {
    private ArrayList<Product> productList = new ArrayList<>();

    //Поиск индекса по id
    private int searchId(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    //добавление нового продукта
    public void addProduct(int id, String name, int price) throws InvalidIDException {
        if (searchId(id) < 0) {
            productList.add(new Product(id, name, price));
            System.out.println("Product added successfully!");
        } else {
            throw new InvalidIDException("Product from id: " + id + " is already in the shop.");
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //удаление продукта по id
    public void removeProduct(int id) throws InvalidIDException {
        if (searchId(id) >= 0) {
            productList.remove(searchId(id));
            System.out.println("The product has been successfully removed!");
        } else {
            throw new InvalidIDException("Product from id: " + id + " does not exist in the shop.");
        }
    }

    //изменение продукта по id
    public void changeProduct(int id, String name, int price) throws InvalidIDException {
        if (searchId(id) >= 0) {
            productList.set(searchId(id), new Product(id, name, price));
            System.out.println("Product changed successfully!");
        } else {
            throw new InvalidIDException("Product from id: " + id + " does not exist in the shop.");
        }
    }

    //Получение всех товаров
    public ArrayList<Product> getAll() {
        return productList;
    }

    //Печать списка продуктов
    public void printProducts(ArrayList<Product> list) {
        for (Product p : list) {
            System.out.println(p.toString());
        }
    }

    /**
     * Сортировка
     * type 0 - по алфавиту
     * type 1 - по цене (вверх)
     * type 2 - по цене (вниз)
     * type 3 - по добавлению
     */
    public ArrayList<Product> sortProduct(int type, ArrayList<Product> products) {
        try {
            ArrayList<Product> listProduct = new ArrayList<>();
            for (Product p : products) {
                listProduct.add(p);
            }
            switch (type) {
                case 0:
                    //listProduct.sort(listProduct.spliterator().getComparator());
                    Collections.sort(listProduct);
                    break;
                case 1:
                    listProduct.sort(comparatorPriceUp);
                    break;
                case 2:
                    listProduct.sort(comparatorPriceDown);
                    break;
                case 3:
                    listProduct.sort(comparatorData);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + type);
            }
            return listProduct;
        } catch (IllegalStateException e) {
            System.out.println(e.toString());
        }
        return products;
    }

    public static Comparator<Product> comparatorPriceUp = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getPrice() - o2.getPrice();
        }
    };

    public static Comparator<Product> comparatorPriceDown = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return o2.getPrice() - o1.getPrice();
        }
    };

    public static Comparator<Product> comparatorData = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            if (o1.getAddDate().toEpochDay() == o2.getAddDate().toEpochDay()) {
                if (o1.getAddTime().toNanoOfDay() < o2.getAddTime().toNanoOfDay()) {
                    return 1;
                } else {
                    return -1;
                }
            } else {
                if (o1.getAddDate().toEpochDay() < o2.getAddDate().toEpochDay()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }
    };
}
