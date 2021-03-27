package HW_210402.ILeg;

public class SamsungLeg implements ILeg{

    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Samsung's leg took one step.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
