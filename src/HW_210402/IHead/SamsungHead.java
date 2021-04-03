package HW_210402.IHead;

public class SamsungHead implements IHead{

    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("Samsung's head says");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
