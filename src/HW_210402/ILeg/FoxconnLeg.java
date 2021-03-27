package HW_210402.ILeg;

public class FoxconnLeg implements ILeg{

    private int price;

    public FoxconnLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Foxconn's leg took one step.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
