package Elderly.People.Project.model;


import java.util.Date;

public class Volunteer {
    private String user;
    private String pwd;
    private String address;
    private String name;
    private String phoneNumber;
    private String email;
    private String hobbies;
    private Date applicationDate;
    private Date acceptationDate;
    private Boolean accepted;
    private Date birthDate;



    public Volunteer() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public Date getAcceptationDate() {
        return acceptationDate;
    }

    public void setAcceptationDate(Date acceptationDate) {
        this.acceptationDate = acceptationDate;
    }

    public Boolean getAccepted() {
        return accepted;
    }

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Volunteer{" +
                "user='" + user + "\'" +
                ", pwd='" + pwd + "\'" +
                ", address='" + address + "\'" +
                ", name=" + name + "\'" +
                ", phoneNumber=" + phoneNumber + "\'" +
                ", email=" + email + "\'" +
                ", hobbies=" + hobbies + "\'" +
                ", applicationDate=" + applicationDate + "\'" +
                ", acceptationDate=" + acceptationDate + "\'" +
                ", accepted=" + accepted + "\'" +
                ", birthDate=" + birthDate + "\'" +
                "}";
    }


}