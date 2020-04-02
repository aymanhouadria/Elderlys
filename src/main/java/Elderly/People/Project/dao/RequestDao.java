package Elderly.People.Project.dao;

import Elderly.People.Project.model.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RequestDao {

    private JdbcTemplate jdbcTemplate;


    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    void addRequest(Request request) {
        String sql = "insert into request (number, service_type, creation_date, state, approved_date, rejected_date, comments, end_date) values (?, ?, ?, ?, ?, ?, ?, ?)";
        this.jdbcTemplate.update(sql,
                request.getNumber(),
                request.getServiceType(),
                request.getCreationDate(),
                request.getState(),
                request.getApprovedDate(),
                request.getRejectedDate(),
                request.getComments(),
                request.getEndDate()
        );
    }

    void deleteRequest(Request request) {
        String sql = "delete from company where number = ?";
        this.jdbcTemplate.update(sql, request.getNumber());
    }

    void updateRequest(Request request) {
        String sql = "update request set number = ?, service_type = ?, creation_date = ?, state = ?, approved_date = ?, rejected_date = ?, comments = ?, end_date = ?";
        this.jdbcTemplate.update(sql,
                request.getNumber(),
                request.getServiceType(),
                request.getCreationDate(),
                request.getState(),
                request.getApprovedDate(),
                request.getRejectedDate(),
                request.getComments(),
                request.getEndDate()
        );
    }


    Request getRequest(String reqNumber) {
        String sql = "SELECT * FROM request WHERE number = ?";

        try {
            return jdbcTemplate.queryForObject(sql, new Object[]{reqNumber}, new RequestRowMapper());
        }
        catch(EmptyResultDataAccessException e) {
            return null;
        }
    }


    List<Request> getRequests() {
        String sql = "SELECT * FROM request";
        try {
            List<Request> requests = jdbcTemplate.query(sql, new RequestRowMapper());
            return requests;
        }

        catch(EmptyResultDataAccessException e) {
            return new ArrayList<Request>();
        }
    }


}
