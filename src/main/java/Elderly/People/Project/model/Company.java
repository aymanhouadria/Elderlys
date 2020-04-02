package Elderly.People.Project.model;

public class Company {

    private String CIF;
    private String name;
    private String address;
    private String CPName;
    private String CPPhoneNumber;
    private String CPPersonEmail;


    public Company() { }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String addrress) {
        this.address = addrress;
    }

    public String getCPName() {
        return CPName;
    }

    public void setCPName(String CPName) {
        this.CPName= CPName;
    }

    public String getCPPhoneNumber() {
        return CPPhoneNumber;
    }

    public void setCPPhoneNumber(String CPPhoneNumber) {
        this.CPPhoneNumber = CPPhoneNumber;
    }

    public String getCPPersonEmail() {
        return CPPersonEmail;
    }

    public void setCPPersonEmail(String CPPersonEmail) {
        this.CPPersonEmail = CPPersonEmail;
    }

    @Override
    public String toString() {
        return "Company{" +
                "CIF='" + CIF + "\'" +
                ", name='" + name + "\'" +
                ", address='" + address + "\'" +
                ", CPName=" + CPName + "\'" +
                ", CPPhoneNumber='" + CPPhoneNumber + "\'" +
                ", CPPersonEmail='" + CPPersonEmail + "\'" +
                "}";
    }
}
