package NBU_.child;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Random;

public class Adult {
    private String firstName;
    private String lastName;
    private final LocalDate birthDate;
    private String jobTitle;
    private BigDecimal salary;
    private BigDecimal savings;
    private BigDecimal creditAmount;
    private boolean isHomeOwner;
    private final String id;
    private String lastPart ;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getSavings() {
        return savings;
    }

    public void setSavings(BigDecimal savings) {
        this.savings = savings;
    }

    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public boolean isHomeOwner() {
        return isHomeOwner;
    }

    public void setHomeOwner(boolean homeOwner) {
        isHomeOwner = homeOwner;
    }

    public String getId() {
        return id;
    }


    public Adult(Child child){
        this.firstName= child.getFirstName();
        this.lastName= child.getLastName();
        this.birthDate= child.getBirthDate();
        this.id=generateId();
    }
    public Adult(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.id = generateId();
    }
    private String generateId(){
        //3 letters fName, 3 lName, birth, 5 digit number
        System.out.println("Generating id");
        String firstPart = firstName.length() >= 3 ? firstName.substring(0,3):firstName;
        String lastPart = lastName.length() < 3? lastName:lastName.substring(0,3);
        String dobPart= birthDate.toString().replaceAll("-","");
        int idPart= new Random().nextInt(90000)+10000;

        return  firstPart+lastPart+dobPart+idPart;
    }
    public void buyHouse(BigDecimal houseValue, Double selfInvPerc){
        if(houseValue.compareTo(BigDecimal.ZERO)<0 && selfInvPerc<0){
            // do nothing
        }else{
            BigDecimal selfInvValue= houseValue.multiply(BigDecimal.valueOf(selfInvPerc/100));
            if (selfInvValue.compareTo(savings)>0){
                //do nothing

            }else{
                this.creditAmount=takeCredit(100-selfInvPerc,houseValue);
                this.savings= savings.subtract(selfInvValue);
                this.isHomeOwner=true;
            }
        }
    }
    private BigDecimal takeCredit(double percentage,BigDecimal houseValue){

        return houseValue.multiply(BigDecimal.valueOf(percentage/100));
    }

    @Override
    public String toString() {
        return "Adult{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", savings=" + savings +
                ", creditAmount=" + creditAmount +
                ", isHomeOwner=" + isHomeOwner +
                ", id='" + id + '\'' +
                ", lastPart='" + lastPart + '\'' +
                '}';
    }
}
