package NBU_.hw3;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String materialName = scanner.next();
        boolean isFragile = scanner.nextInt() == 1;


        Material material = new Material(materialName, isFragile);


        boolean isDeliveryToClientAddress = scanner.nextInt() == 1;
        double minPrice = scanner.nextDouble();

        Document document = new Document(minPrice, isDeliveryToClientAddress);


        double weight = scanner.nextDouble();
        double pricePerKg = scanner.nextDouble();

        WeightedItem weightedItem = new WeightedItem(material, weight, pricePerKg, isDeliveryToClientAddress);


        double additionalPrice = scanner.nextDouble();
        DeliverableItem.setAdditionalPrice(additionalPrice);


        Deliverable deliverable = document;
        System.out.printf("%.1f%n", deliverable.deliveryPrice());


        deliverable = weightedItem;
        System.out.printf("%.2f%n", deliverable.deliveryPrice());
    }
}