package Domain;

public class Person {
    private String firstName;
    private String lastName;
    private Integer SSN;
    private Long phoneNumber;

    public Person() {
    }

    public Person(String firstName, String lastName,  Long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = 1000000;
        this.phoneNumber = phoneNumber;
    }

    public Person(String firstName, String lastName, Integer SSN, Long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.phoneNumber = phoneNumber;
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

    public Integer getSSN() {
        return SSN;
    }

    public void setSSN(Integer SSN) {
        this.SSN = SSN;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", SSN=" + SSN +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
