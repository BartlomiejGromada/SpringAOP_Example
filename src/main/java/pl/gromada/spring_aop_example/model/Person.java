package pl.gromada.spring_aop_example.model;

public class Person {

    private String personalIdentityNumber;
    private String firstName;
    private String lastName;
    private GENDER gender;

    public Person(String personalIdentityNumber, String firstName, String lastName, GENDER gender) {
        this.personalIdentityNumber = personalIdentityNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getPersonalIdentityNumber() {
        return personalIdentityNumber;
    }

    public void setPersonalIdentityNumber(String personalIdentityNumber) {
        this.personalIdentityNumber = personalIdentityNumber;
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

    public GENDER getGender() {
        return gender;
    }

    public void setGender(GENDER gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personalIdentityNumber='" + personalIdentityNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                '}';
    }
}
