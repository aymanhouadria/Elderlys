package Elderly.People.Project.dao;

import Elderly.People.Project.model.Volunteer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Repository
public class VolunteerDao {

    private JdbcTemplate jdbcTemplate;


    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    void addVolunteer(Volunteer volunteer) {
        String sql = "insert into volunteer (user, password, address, name, phone_numer, email, hobbies, application_date, acceptation_date, accepted, birth_date) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        this.jdbcTemplate.update(sql,
                volunteer.getUser(),
                volunteer.getPwd(),
                volunteer.getAddress(),
                volunteer.getName(),
                volunteer.getPhoneNumber(),
                volunteer.getEmail(),
                volunteer.getHobbies(),
                volunteer.getApplicationDate(),
                volunteer.getAcceptationDate(),
                volunteer.getAccepted(),
                volunteer.getBirthDate()
        );
    }

    void deleteVolunteer(Volunteer volunteer) {
        String sql = "delete from volunteer where user = ?";
        this.jdbcTemplate.update(sql, volunteer.getUser());
    }

    void updateVolunteer(Volunteer volunteer) {
        String sql = "update request set user = ?, password = ?, address = ?, name = ?, phone_number = ?, email = ?, hobbies = ?, application_date = ?, acceptation_date = ?, accepted = ?, birth_date= ?";
        this.jdbcTemplate.update(sql,
                volunteer.getUser(),
                volunteer.getPwd(),
                volunteer.getAddress(),
                volunteer.getName(),
                volunteer.getPhoneNumber(),
                volunteer.getEmail(),
                volunteer.getHobbies(),
                volunteer.getApplicationDate(),
                volunteer.getAcceptationDate(),
                volunteer.getAccepted(),
                volunteer.getBirthDate()
        );
    }


    Volunteer getVolunteer(String user) {
        String sql = "SELECT * FROM volunteer WHERE user = ?";

        try {
            return jdbcTemplate.queryForObject(sql, new Object[]{user}, new VolunteerRowMapper());
        }
        catch(EmptyResultDataAccessException e) {
            return null;
        }
    }


    List<Volunteer> getVolunteers() {
        String sql = "SELECT * FROM volunteer";
        try {
            List<Volunteer> volunteers = jdbcTemplate.query(sql, new VolunteerRowMapper());
            return volunteers;
        }

        catch(EmptyResultDataAccessException e) {
            return new ArrayList<Volunteer>();
        }
    }


}
