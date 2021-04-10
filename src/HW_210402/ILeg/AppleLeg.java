package HW_210402.ILeg;

public class AppleLeg implements ILeg {

    private int price;

    public AppleLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Apple's leg took one step.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
