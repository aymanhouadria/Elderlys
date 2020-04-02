package Elderly.People.Project.dao;

import Elderly.People.Project.model.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;


@Repository
public class ContractDao {

    private JdbcTemplate jdbcTemplate;


    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    void addContract(Contract contract) {
        String sql = "INSERT INTO company (number, datebeginning, dateending, description, quantityservices, unitsofmeasure, priceunit) values (?, ?, ?, ?, ?, ?, ?, ?)";
        this.jdbcTemplate.update(sql,
                contract.getNumber(),
                contract.getDateBeginning(),
                contract.getDateEnding(),
                contract.getDescription(),
                contract.getQuantityServices(),
                contract.getUnitsOfMeasure(),
                contract.getPriceUnit()
        );
    }


    void deleteContract(Contract contract) {
        String sql = "DELETE FROM contract WHERE number = ?";
        this.jdbcTemplate.update(sql, contract.getNumber());
    }


    void updateContract(Contract contract) {
        String sql = "UPDATE contract SET datebeginning = ?, dateending = ?, description = ?, quantityServices = ?, unitsofmeasure = ?, priceunit = ? WHERE number = ?";
        this.jdbcTemplate.update(sql,
                contract.getDateBeginning(),
                contract.getDateEnding(),
                contract.getDescription(),
                contract.getPriceUnit(),
                contract.getQuantityServices(),
                contract.getUnitsOfMeasure(),
                contract.getNumber()
        );
    }


    Contract getContract(int numContract) {
        String sql = "SELECT * FROM contract WHERE number = ?";
        try {
            return jdbcTemplate.queryForObject(sql, new Object[]{numContract}, new ContractRowMapper());
        }
        catch(EmptyResultDataAccessException e) {
            return null;
        }
    }


    List<Contract> getContract() {
        String sql = "SELECT * FROM contract";
        try {
            List<Contract> contracts = jdbcTemplate.query(sql, new ContractRowMapper());
            return contracts;
        }
        catch(EmptyResultDataAccessException e) {
            return new ArrayList<Contract>();
        }
    }
}
