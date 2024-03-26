package NBU_.task2_;

public abstract class Goods implements CanBeSold {

    private double overcharge;
    public Goods(){

    }
    public Goods(double overcharge) {
        this.overcharge = overcharge;
    }

    @Override
    public double sellingPrice() {
        return productionPrice() + this.overcharge;
    }
}




