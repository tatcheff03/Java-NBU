package NBU_.hw2;

 class Cooker extends ElectricDevice {
     public boolean isItGas;

     public Cooker(Manufacturer manufacturer, int minimalMonthsOfWarranty, boolean isItGas) {
         super(manufacturer, minimalMonthsOfWarranty);
         this.isItGas = isItGas;
     }

             @Override
        public int warranty(){
         return isItGas?super.warranty()+12:super.warranty();
             }
 }
