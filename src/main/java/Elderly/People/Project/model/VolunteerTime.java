package Elderly.People.Project.model;


import java.util.Date;

public class VolunteerTime {
    private String userCAS;
    private String name;
    private String pwd;
    private String phoneNumber;
    private String email;

    public VolunteerTime() {
    }


    public String getUserCAS() {
        return userCAS;
    }

    public void setUserCAS(String userCAS) {
        this.userCAS = userCAS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
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

    @Override
    public String toString() {
        return "VolunteerTime{" +
                "userCAS='" + userCAS + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}