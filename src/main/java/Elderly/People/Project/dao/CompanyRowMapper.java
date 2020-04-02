package Elderly.People.Project.dao;

import Elderly.People.Project.model.Company;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class CompanyRowMapper implements RowMapper<Company> {
    public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
       Company company = new Company();
        company.setCIF(rs.getString("CIF"));
        company.setName(rs.getString("name"));
        company.setAddress(rs.getString("address"));
        company.setCPName(rs.getString("CPName"));
        company.setCPPhoneNumber(rs.getString("CPPhoneNumber"));
        company.setCPPersonEmail(rs.getString("CPPersonEmail"));

        return company;
    }
}