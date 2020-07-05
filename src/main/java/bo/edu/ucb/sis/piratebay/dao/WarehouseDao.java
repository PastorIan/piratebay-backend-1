package bo.edu.ucb.sis.piratebay.dao;

import bo.edu.ucb.sis.piratebay.model.WarehouseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class WarehouseDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public WarehouseDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<WarehouseModel> findAllMovies() {

        String query = "SELECT a.product_code , a.product_name, b.data_type, c.date, d.provider_name, e.qtty_commit\n" +
                "\tFROM product a, attribute b, public.\"order\" c, provider d, product_order e, warehouse f" +
                "\tWHERE a.product_id = b.product_id " +
                "\tAND a.product_id = e.product_id " +
                "\tAND c.order_id = e.order_id " +
                "\tAND  d.provider_id = c.provider_id " +
                "\tAND f.warehouse_id = c.warehouse_id";
        List<WarehouseModel> result = null;
        try {
            result = jdbcTemplate.query(query, new RowMapper<WarehouseModel>() {
                @Override
                public WarehouseModel mapRow(ResultSet resultSet, int i) throws SQLException {
                    return new WarehouseModel(resultSet.getString(1),
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getString(4),
                            resultSet.getString(5),
                            resultSet.getInt(6));
                }
            });
        } catch (Exception ex) {
            throw new RuntimeException();
        }
        return result;
    }
}
