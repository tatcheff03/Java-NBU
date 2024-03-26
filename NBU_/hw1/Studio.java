package NBU_.hw1;

import java.math.BigDecimal;


public class Studio {
    private final long id;
    private BigDecimal pricePerHour;
    private int maxWorkingHours;
    private int hoursWorked;
    private BigDecimal minPricePerHour;
    private BigDecimal euro;

    public Studio(long id, int maxWorkingHours) {
        this.id = id;
        this.maxWorkingHours = (maxWorkingHours >= 0 && maxWorkingHours <= 24) ? maxWorkingHours : 24;
        this.minPricePerHour = BigDecimal.ZERO;
        this.euro = BigDecimal.ONE;
    }

    public void setMinPrice(BigDecimal minPricePerHour) {
        this.minPricePerHour = (minPricePerHour.compareTo(BigDecimal.ZERO) >= 0) ? minPricePerHour : BigDecimal.ZERO;
    }

    public void setPricePerHour(BigDecimal pricePerHour) {
        this.pricePerHour = (pricePerHour.compareTo(minPricePerHour) >= 0) ? pricePerHour : minPricePerHour;
    }

    public void setWorkedHours(int workedHours) {
        this.hoursWorked = (workedHours <= maxWorkingHours) ? workedHours : maxWorkingHours;
    }

    public void setEuro(BigDecimal currencyEuro) {
        this.euro = currencyEuro;
    }

    public long getId() {
        return id;
    }

    public BigDecimal getPricePerHour() {
        return pricePerHour;
    }

    public int getMaxWorkingHours() {
        return maxWorkingHours;
    }

    public int getWorkedHours() {
        return hoursWorked;
    }

    public BigDecimal getMinPricePerHour() {
        return minPricePerHour;
    }

    public BigDecimal getEuro() {
        return euro;
    }

    public BigDecimal getValueInLeva() {
        return pricePerHour.multiply(BigDecimal.valueOf(hoursWorked));
    }

    public BigDecimal getValueInEuro() {
        return getValueInLeva().multiply(euro).setScale(3, BigDecimal.ROUND_HALF_UP);
    }


    public static Studio compareByPrice(Studio studio1, Studio studio2) {
        return studio1.getPricePerHour().compareTo(studio2.getPricePerHour()) > 0 ? studio1 : studio2;
    }

    public static boolean compareByRevenue(Studio studio1, Studio studio2) {
        return studio1.getValueInLeva().compareTo(studio2.getValueInLeva()) > 0;
    }
}