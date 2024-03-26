package NBU_.hw2;

 class WashingMachine extends ElectricDevice {
     public boolean hasDryer;

     public WashingMachine(Manufacturer manufacturer, int minimalMonthsOfWarranty, boolean hasDryer) {
         super(manufacturer, minimalMonthsOfWarranty);
         this.hasDryer = hasDryer;
     }

         @Override
     public int warranty(){
         return hasDryer?super.warranty()+(minimalMonthsOfWarranty/2):super.warranty();
     }
 }