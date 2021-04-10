package HW_210416;

import java.time.LocalDate;
import java.time.LocalTime;

public class Product implements Comparable {
    private int id;
    private String name;
    private int price;
    private LocalDate addDate;
    private LocalTime addTime;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
        addDate = LocalDate.now();
        addTime = LocalTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getAddDate() {
        return addDate;
    }

    public LocalTime getAddTime() {
        return addTime;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return this.getName().compareTo(((Product) o).getName());
    }
}
