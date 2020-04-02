package Elderly.People.Project.dao;


import Elderly.People.Project.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class InvoiceDao {

    private JdbcTemplate jdbcTemplate;


    @Autowired
    public void setDataSource(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }


    void addInvoice(Invoice invoice) {
        String sql = "insert into Invoice (date, number, amount, concept) values (?, ?, ?, ?)";
        this.jdbcTemplate.update(sql,
                invoice.getDate(),
                invoice.getNumber(),
                invoice.getAmount(),
                invoice.getConcept()


        );


    }


    void deleteInvoice(Invoice invoice) {
        String sql = "delete from Invoice where number = ?";
        this.jdbcTemplate.update(sql, invoice.getNumber());
    }


    void updateInvoice(Invoice invoice) {
        String sql = "update contract set date = ?, amount = ?, concept = ?";
        this.jdbcTemplate.update(sql,
                invoice.getDate(),
                invoice.getAmount(),
                invoice.getConcept()
        );
    }


    Invoice getInvoice(String number) {
        String sql = "SELECT * FROM Invoice WHERE number = ?";

        try {
            return jdbcTemplate.queryForObject(sql, new Object[]{number}, new InvoiceRowMapper());
        }
        catch(EmptyResultDataAccessException e) {
            return null;
        }
    }


    List<Invoice> getElderlyInvoice() {
        String sql = "SELECT * FROM Invoice";
        try {


            List<Invoice> invoices = jdbcTemplate.query(
                    sql,
                    new InvoiceRowMapper());

            return invoices;
        }
        catch(EmptyResultDataAccessException e) {
            return new ArrayList<Invoice>();
        }
    }
}
