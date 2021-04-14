package HW_210416;

import HW_210416.Exceptions.InvalidCommandException;
import HW_210416.Exceptions.InvalidIDException;

import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationMenu {
    private boolean startActive;
    Scanner scanner = new Scanner(System.in);
    Shop shop;

    public ApplicationMenu() {
        startActive = true;
        shop = new Shop();
    }

    public boolean isStartActive() {
        return startActive;
    }

    void start() throws InvalidCommandException {
        System.out.print("Enter the command (print, add, remove, change, exit):");
        String command = scanner.nextLine();
        switch (command) {
            case "print":
                print();
                break;
            case "add":
                add();
                break;
            case "remove":
                remove();
                break;
            case "change":
                change();
                break;
            case "exit":
                startActive = false;
                break;
            default:
                throw new InvalidCommandException("Invalid start command: " + command + ".");
        }
    }

    private void print() throws InvalidCommandException {
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
            default:
                throw new InvalidCommandException("Invalid sort command: " + command + ".");
        }
        ArrayList<Product> products = shop.sortProduct(sortType, shop.getAll());
        shop.printProducts(products);
    }

    private void add() {
        try {
            System.out.print("Enter id:");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter product name:");
            String name = scanner.nextLine();
            System.out.print("Enter product price:");
            int price = Integer.parseInt(scanner.nextLine());
            shop.addProduct(id, name, price);
        } catch (InvalidIDException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    private void remove() {
        try {
            System.out.print("Enter id:");
            int id = Integer.parseInt(scanner.nextLine());
            shop.removeProduct(id);
        } catch (InvalidIDException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    private void change() {
        try {
            System.out.print("Enter id:");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter product name:");
            String name = scanner.nextLine();
            System.out.print("Enter product price:");
            int price = Integer.parseInt(scanner.nextLine());
            shop.changeProduct(id, name, price);
        } catch (InvalidIDException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
