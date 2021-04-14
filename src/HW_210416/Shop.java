package HW_210416;

import HW_210416.Exceptions.InvalidIDException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

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
        ArrayList<Product> getProductList = new ArrayList<>();
        for (Product p : productList) {
            getProductList.add(p);
        }
        return getProductList;
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
            PriorityQueue<Product> queueProducts;
            switch (type) {
                case 0:
                    queueProducts = new PriorityQueue<>();
                    break;
                case 1:
                    queueProducts = new PriorityQueue<>(1, comparatorPriceUp);
                    break;
                case 2:
                    queueProducts = new PriorityQueue<>(1, comparatorPriceDown);
                    break;
                case 3:
                    queueProducts = new PriorityQueue<>(1, comparatorData);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + type);
            }
            queueProducts.addAll(products);
            ArrayList<Product> listProduct = new ArrayList<>();
            int sizeQueueProducts = queueProducts.size();
            for (int i = 0; i < sizeQueueProducts; i++) {
                listProduct.add(queueProducts.poll());
            }
            return listProduct;
        } catch (IllegalStateException e) {
            e.printStackTrace();
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
