package Elderly.People.Project.dao;

import Elderly.People.Project.model.ElderlyPeople;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ElderlyPeopleDao {

    private JdbcTemplate jdbcTemplate;


    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    void addElderlyPeople(ElderlyPeople elderlyPeople) {
        String sql = "INSERT INTO elderly (DNI, name, surname, address, birthdate, phoneNumber, email, userPwd, dateCreation, alergies, diseases) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        this.jdbcTemplate.update(sql,
                elderlyPeople.getDNI(),
                elderlyPeople.getName(),
                elderlyPeople.getSurname(),
                elderlyPeople.getAddress(),
                elderlyPeople.getBirthDate(),
                elderlyPeople.getPhoneNumber(),
                elderlyPeople.getBankAccountCode(),
                elderlyPeople.getEmail(),
                elderlyPeople.getUserPwd(),
                elderlyPeople.getDateCreation(),
                elderlyPeople.getAlergies(),
                elderlyPeople.getDiseases()
        );
    }


    void deleteElderlyPeople(ElderlyPeople elderly) {
        String sql = "DELETE FROM elderly WHERE dni = ?";
        this.jdbcTemplate.update(sql, elderly.getDNI());
    }


    void updateElderlyPeople(ElderlyPeople elderlyPeople) {
        String sql = "update contract set name = ?,  surname = ?, birthDate = ?, address = ?, phoneNumber = ?, email = ?, userPwd = ?, dateCreation = ?, alergies = ?, diseases = ? WHERE dni = ?";
        this.jdbcTemplate.update(sql,
                elderlyPeople.getName(),
                elderlyPeople.getSurname(),
                elderlyPeople.getBirthDate(),
                elderlyPeople.getAddress(),
                elderlyPeople.getPhoneNumber(),
                elderlyPeople.getBankAccountCode(),
                elderlyPeople.getEmail(),
                elderlyPeople.getUserPwd(),
                elderlyPeople.getDateCreation(),
                elderlyPeople.getAlergies(),
                elderlyPeople.getDiseases(),
                elderlyPeople.getDNI()
        );
    }


    ElderlyPeople getElderlyPeople(String Dni) {
        String sql = "SELECT * FROM elderly WHERE dni = ?";
        try {
            return jdbcTemplate.queryForObject(sql, new Object[]{Dni}, new ElderlyPeopleRowMapper());
        }
        catch(EmptyResultDataAccessException e) {
            return null;
        }
    }


    List<ElderlyPeople> getElderlyPeople() {
        String sql = "SELECT * FROM elderly";
        try {
            List<ElderlyPeople> elderlies = jdbcTemplate.query(sql, new ElderlyPeopleRowMapper());
            return elderlies;
        }
        catch(EmptyResultDataAccessException e) {
            return new ArrayList<ElderlyPeople>();
        }
    }
}
