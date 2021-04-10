package HW_210402.IHand;

public class FoxconnHand implements IHand{

    private int price;

    public FoxconnHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Foxconn's hand went up.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
