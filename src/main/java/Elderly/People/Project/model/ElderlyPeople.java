package Elderly.People.Project.model;


import java.time.LocalDate;
import java.util.Date;

public class ElderlyPeople {
    private String DNI;
    private String name;
    private String surname;
    private String address;
    private Date birthDate;
    private String phoneNumber;
    private String email;
    private String userPwd;
    private Date dateCreation;
    private String alergies;
    private String diseases;
    private String bankAccountCode;

    public ElderlyPeople() {
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI =DNI;
    }

    public String getName() {
        return name;
    }

    public void setName(String surname) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber= phoneNumber;
    }

    public String getBankAccountCode() { return bankAccountCode; }

    public void setBankAccountCode(String bankAccountCode) { this.bankAccountCode = bankAccountCode; }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getAlergies() {
        return alergies;
    }

    public void setAlergies(String alergies) {
        this.alergies = alergies;
    }

    public String getDiseases() {
        return diseases;
    }

    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }


    @Override
    public String toString() {
        return "ElderlyPeople{" +
                "DNI='" + DNI + "\'" +
                ", name='" + name + "\'" +
                ", surname='" + surname + "\'" +
                ", address=" + address + "\'" +
                ", birthDate='" + birthDate + "\'" +
                ", phoneNumber='" + phoneNumber + "\'" +
                ", bankAccountumber='" + bankAccountCode + "\'" +
                ", email='" + email + "\'" +
                ", userPwd='" + userPwd + "\'" +
                ", dateCreation='" + dateCreation + "\'" +
                ", alergies='" + alergies + "\'" +
                ", diseases='" + diseases + "\'" +
                "}";
    }


}
