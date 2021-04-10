package HW_210402.IHand;

public class SamsungHand implements IHand{

    private int price;

    public SamsungHand (int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        System.out.println("Samsung's hand went up.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
