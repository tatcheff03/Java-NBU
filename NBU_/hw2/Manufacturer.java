package NBU_.hw2;

 class Manufacturer {
    public String manufacturer;
    public boolean extendedWarranty;

public Manufacturer(){

}

    public Manufacturer(String manufacturer, boolean extendedWarranty) {
        this.manufacturer = manufacturer;
        this.extendedWarranty = extendedWarranty;
    }

    public boolean isExtendedWarranty() {
        return extendedWarranty;
    }
}
