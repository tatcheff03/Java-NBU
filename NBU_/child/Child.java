package NBU_.child;

import java.time.LocalDate;

public class Child {
    private String firstName;
    private  String lastName;
    private LocalDate birthDate;

    //adult parent
private Adult adult;
    public Child(){

    }


    public Child(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

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

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;

    }

    @Override
    public String toString() {
        return "Child{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", adult=" + adult +
                '}';
    }
}

