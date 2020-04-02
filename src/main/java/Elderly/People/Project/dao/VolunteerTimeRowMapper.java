package Elderly.People.Project.dao;
import Elderly.People.Project.model.VolunteerTime;

import org.springframework.jdbc.core.RowMapper;



import java.sql.ResultSet;
import java.sql.SQLException;


public final class VolunteerTimeRowMapper implements RowMapper<VolunteerTime> {
    public VolunteerTime mapRow(ResultSet rs, int rowNum) throws SQLException {
        VolunteerTime volunteerTime = new VolunteerTime();
        volunteerTime.setUserCAS(rs.getString("user"));
        volunteerTime.setName(rs.getString("name"));
        volunteerTime.setPwd(rs.getString("password"));
        volunteerTime.setPhoneNumber(rs.getString("number"));
        volunteerTime.setEmail(rs.getString("email"));

        return volunteerTime;
    }

}