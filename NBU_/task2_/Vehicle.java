package NBU_.task2_;

public class Vehicle extends Goods{

    private double materialsCosts;
    private double salariesCosts;
public  Vehicle(){

}
    public Vehicle(double overcharge, double materialsCosts, double salariesCosts) {
        super(overcharge);
        this.materialsCosts = materialsCosts;
        this.salariesCosts = salariesCosts;
    }

    public double productionPrice() {
        return this.materialsCosts + this.salariesCosts;
    }
}
