package Elderly.People.Project.dao;
import Elderly.People.Project.model.Volunteer;

import org.springframework.jdbc.core.RowMapper;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public final class VolunteerRowMapper implements RowMapper<Volunteer> {
    public Volunteer mapRow(ResultSet rs, int rowNum) throws SQLException {
        Volunteer volunteer = new Volunteer();
        volunteer.setUser(rs.getString("user"));
        volunteer.setPwd(rs.getString("password"));
        volunteer.setAddress(rs.getString("address"));
        volunteer.setName(rs.getString("name"));
        volunteer.setPhoneNumber(rs.getString("phone_number"));
        volunteer.setEmail(rs.getString("email"));
        volunteer.setHobbies(rs.getString("hobbies"));
        volunteer.setApplicationDate(rs.getDate("application_date"));
        volunteer.setAcceptationDate(rs.getDate("acceptation_date"));
        volunteer.setAccepted(rs.getBoolean("accepted"));
        volunteer.setBirthDate(rs.getDate("birth_date"));

        return volunteer;
    }

}