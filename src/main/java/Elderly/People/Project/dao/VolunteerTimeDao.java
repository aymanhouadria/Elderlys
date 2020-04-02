package Elderly.People.Project.dao;

import Elderly.People.Project.model.VolunteerTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Repository
public class VolunteerTimeDao {

    private JdbcTemplate jdbcTemplate;


    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    void addVolunteerTime(VolunteerTime volunteerTime) {
        String sql = "insert into availability (user, name, password, number, email) values (?, ?, ?, ?, ?)";
        this.jdbcTemplate.update(sql,
                volunteerTime.getUserCAS(),
                volunteerTime.getName(),
                volunteerTime.getPwd(),
                volunteerTime.getPhoneNumber(),
                volunteerTime.getEmail()
        );
    }

    void deleteVolunteerTime(VolunteerTime volunteerTime) {
        String sql = "delete from availability where user = ?";
        this.jdbcTemplate.update(sql, volunteerTime.getUserCAS());
    }

    void updateVolunteerTime(VolunteerTime volunteerTime) {
        String sql = "update availability set user = ?, name = ?, password = ?, number = ?, email = ?";
        this.jdbcTemplate.update(sql,
                volunteerTime.getUserCAS(),
                volunteerTime.getName(),
                volunteerTime.getPwd(),
                volunteerTime.getPhoneNumber(),
                volunteerTime.getEmail()
        );
    }


    VolunteerTime getVolunteerTime(String user) {
        String sql = "SELECT * FROM availability WHERE user = ?";

        try {
            return jdbcTemplate.queryForObject(sql, new Object[]{user}, new VolunteerTimeRowMapper());
        }
        catch(EmptyResultDataAccessException e) {
            return null;
        }
    }


    List<VolunteerTime> getVolunteerTimes() {
        String sql = "SELECT * FROM availability";
        try {
            List<VolunteerTime> volunteerTimes = jdbcTemplate.query(sql, new VolunteerTimeRowMapper());
            return volunteerTimes;
        }

        catch(EmptyResultDataAccessException e) {
            return new ArrayList<VolunteerTime>();
        }
    }


}
