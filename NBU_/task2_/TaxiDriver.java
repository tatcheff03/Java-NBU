package NBU_.task2_;

public class TaxiDriver extends RegProvider{

    private double numberOfKm;
    private double pricePerKm;

public TaxiDriver(){

}
    public TaxiDriver(String regNum, double numberOfKm, double pricePerKm) {
        super(regNum);
        this.numberOfKm = numberOfKm;
        this.pricePerKm = pricePerKm;
    }

    @Override
    public double income() {
        return this.numberOfKm * this.pricePerKm;
    }
}
