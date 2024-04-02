package NBU_.hw3;

public class Document extends DeliverableItem {
    private double minPrice;

    public Document(double minPrice, boolean isDeliveryToClientAddress) {
        super(isDeliveryToClientAddress);
        this.minPrice = minPrice > 0 ? minPrice : 1;
    }

    @Override
    public double deliveryPrice() {
        return minPrice + super.deliveryPrice();
    }
}