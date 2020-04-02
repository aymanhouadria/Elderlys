package Elderly.People.Project.dao;
import Elderly.People.Project.model.Request;

import org.springframework.jdbc.core.RowMapper;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public final class RequestRowMapper implements RowMapper<Request> {
    public Request mapRow(ResultSet rs, int rowNum) throws SQLException {
        Request request = new Request();
        request.setNumber(rs.getString("number"));
        request.setServiceType(rs.getString("service_type"));
        request.setCreationDate(rs.getDate("creation_date"));
        request.setState(rs.getString("CPName"));
        request.setApprovedDate(rs.getDate("CPPhoneNumber"));
        request.setRejectedDate(rs.getDate("CPPersonEmail"));
        request.setComments(rs.getString("CPPersonEmail"));
        request.setEndDate(rs.getDate("CPPersonEmail"));

        return request;
    }

}