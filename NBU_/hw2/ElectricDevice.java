package NBU_.hw2;

 class ElectricDevice extends Manufacturer {

     public int minimalMonthsOfWarranty;


     public ElectricDevice(){

     }
     public ElectricDevice(Manufacturer manufacturer, int minimalMonthsOfWarranty) {
            super(manufacturer.manufacturer, manufacturer.extendedWarranty);
            this.minimalMonthsOfWarranty = Math.max(minimalMonthsOfWarranty, 6);
     }

        public int warranty(){
          return isExtendedWarranty()?minimalMonthsOfWarranty+12:minimalMonthsOfWarranty;
        }
 }