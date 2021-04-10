package HW_210402.IHand;

public class AppleHand implements IHand{

    private int price;

    public AppleHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Apple's hand went up.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
