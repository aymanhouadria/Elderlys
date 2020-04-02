package Elderly.People.Project.dao;

import Elderly.People.Project.model.Contract;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public final class ContractRowMapper implements RowMapper<Contract> {
    public Contract mapRow(ResultSet rs, int rowNum) throws SQLException {

        Contract contract = new Contract();
        contract.setNumber(rs.getString("number"));
        contract.setDateBeginning((rs.getDate("dateBeginning")));
        contract.setDateEnding((rs.getDate("dateEnding")));
        contract.setDescription(rs.getString("description"));
        contract.setQuantityServices(rs.getString("quantityServices"));
        contract.setUnitsOfMeasure(rs.getString("unitsOfMeasure"));
        contract.setPriceUnit(rs.getString("priceUnit"));

        return contract;
    }

}