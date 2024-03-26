package NBU_.hw1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Manager {
    private String managerName;
    private LocalDate dateHired;

    public Manager(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }

    public long numberOfYearsInCompanyTill(LocalDate endDate) {
        return ChronoUnit.YEARS.between(this.dateHired, endDate);
    }

}