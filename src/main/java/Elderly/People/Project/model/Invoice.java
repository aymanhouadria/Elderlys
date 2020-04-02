package Elderly.People.Project.model;


import java.time.LocalDate;
import java.util.Date;

public class Invoice {
    private String number;
    private Date date;
    private int amount;
    private String concept;


    public Invoice() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number =number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "number='" + number + "\'" +
                ", date='" + date + "\'" +
                ", amount='" + amount +
                ", concept=" + concept + "\'" +
                "}";
    }


}