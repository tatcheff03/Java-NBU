package NBU_.task2_;

public class Engineer implements Provider{

        private double workedHours;
        private double pricePerHour;

        public Engineer(double workedHours, double pricePerHour) {
            this.workedHours = workedHours;
            this.pricePerHour = pricePerHour;
        }

        @Override
        public double income() {
            return this.pricePerHour * this.workedHours;
        }


}
