package bo.edu.ucb.sis.piratebay.dao;

import bo.edu.ucb.sis.piratebay.model.DepartamentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class DepartmentDao {
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public DepartmentDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<DepartamentModel> findAllCities() {

        String query = "SELECT warehouse_id, warehouse_name " +
                "\tFROM warehouse ";
        List<DepartamentModel> result = null;
        try {
            result = jdbcTemplate.query(query, new RowMapper<DepartamentModel>() {
                @Override
                public DepartamentModel mapRow(ResultSet resultSet, int i) throws SQLException {
                    return new DepartamentModel(resultSet.getInt(1),
                            resultSet.getString(2));
                }
            });
        } catch (Exception ex) {
            throw new RuntimeException();
        }
        return result;
    }
}
