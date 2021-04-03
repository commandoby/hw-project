package HW_210402.IHead;

public class AppleHead implements IHead{

    private int price;

    public AppleHead(int price) {
        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("Apple's head says.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
