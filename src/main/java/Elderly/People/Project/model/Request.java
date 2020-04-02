package Elderly.People.Project.model;


import java.util.Date;

public class Request {
    private String number;
    private String serviceType;
    private Date creationDate;
    private String state;
    private Date approvedDate;
    private Date rejectedDate;
    private String comments;
    private Date endDate;


    public Request() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number =number;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(Date approvedDate) {
        this.approvedDate = approvedDate;
    }

    public Date getRejectedDate() {
        return rejectedDate;
    }

    public void setRejectedDate(Date rejectedDATE) {
        this.rejectedDate = rejectedDATE;
    }
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Request{" +
                "number='" + number + "\'" +
                ", serviceType='" + serviceType + "\'" +
                ", creationDate='" + creationDate + "\'" +
                ", state=" + state + "\'" +
                ", approvedDate=" + approvedDate + "\'" +
                ", rejectedDATE=" + rejectedDate + "\'" +
                ", comments=" + comments + "\'" +
                ", endDate=" + endDate + "\'" +
                "}";
    }


}