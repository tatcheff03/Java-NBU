package NBU_.hw3;

public class WeightedItem extends DeliverableItem {
    private Material material;
    private double weight;
    private double pricePerKg;

    public WeightedItem(Material material, double weight, double pricePerKg, boolean isDeliveryToClientAddress) {
        super(isDeliveryToClientAddress);
        this.material = material;
        this.weight = weight > 0 ? weight : 1;
        this.pricePerKg = pricePerKg > 0 ? pricePerKg : 1;
    }

    @Override
    public double deliveryPrice() {
        double price = weight * pricePerKg + super.deliveryPrice();
        return material.isFragile() ? price * 1.01 : price;
    }
}