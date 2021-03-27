package HW_210402.IHead;

public class FoxconnHead implements IHead{

    private int price;

    public FoxconnHead(int price) {
        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("Foxconn's head says.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
