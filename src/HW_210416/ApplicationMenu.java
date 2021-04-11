package HW_210416;

import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationMenu {
    private boolean startActive;
    Scanner scanner = new Scanner(System.in);
    Shop shop;

    public ApplicationMenu(Shop shop) {
        this.shop = shop;
    }

    void start () {
        startActive = true;
        while (startActive) {
            System.out.print("Enter the command (print, add, remove, change, exit):");
            String command = scanner.nextLine();
            switch (command) {
                case "print": print();
                    break;
                case "add": add();
                    break;
                case "remove": remove();
                    break;
                case "change": change();
                    break;
                case "exit": startActive = false;
                    break;
                default: //Exception
            }
        }
    }

    private void print() {
        int sortType = 0;
        System.out.print("Enter the sort type (name, priceup, pricedown, data):");
        String command = scanner.nextLine();
        switch (command) {
            case "name":
                sortType = 0;
                break;
            case "priceup":
                sortType = 1;
                break;
            case "pricedown":
                sortType = 2;
                break;
            case "data":
                sortType = 3;
                break;
            default: //Exception
        }
        ArrayList<Product> products = shop.sortProduct(sortType, shop.getAll());
        shop.printProducts(products);
    }

    private void add() {
        System.out.print("Enter id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter product name:");
        String name = scanner.nextLine();
        System.out.print("Enter product price:");
        int price = Integer.parseInt(scanner.nextLine());
        shop.addProduct(id, name, price);
    }

    private void remove () {
        System.out.print("Enter id:");
        int id = Integer.parseInt(scanner.nextLine());
        shop.removeProduct(id);
    }

    private void change () {
        System.out.print("Enter id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter product name:");
        String name = scanner.nextLine();
        System.out.print("Enter product price:");
        int price = Integer.parseInt(scanner.nextLine());
        shop.changeProduct(id, name, price);
    }
}
