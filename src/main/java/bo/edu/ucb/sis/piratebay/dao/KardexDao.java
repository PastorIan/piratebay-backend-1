package bo.edu.ucb.sis.piratebay.dao;

import bo.edu.ucb.sis.piratebay.model.DepartamentModel;
import bo.edu.ucb.sis.piratebay.model.KardexModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class KardexDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public KardexDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<KardexModel> findAllKardex(String code) {

        String query = "SELECT a.date , a.description, a.bill, a.unit_value, a.input_qtt, a.input_value, a.output_qtt, a.output_value, a.balance, a.balance_value " +
                "\tFROM kardex_peps a, product b, product_order c, public.\"order\" d, warehouse e " +
                "\tWHERE a.product_product_id = b.product_id " +
                "\tAND b.product_id = c.product_id " +
                "\tAND c.order_id = d.order_id " +
                "\tAND d.warehouse_id = e.warehouse_id " +
                "\tAND b.product_code = '"+code+"'";
        List<KardexModel> result = null;
        try {
            result = jdbcTemplate.query(query, new RowMapper<KardexModel>() {
                @Override
                public KardexModel mapRow(ResultSet resultSet, int i) throws SQLException {
                    return new KardexModel(resultSet.getString(1),
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getDouble(4),
                            resultSet.getInt(5),
                            resultSet.getDouble(6),
                            resultSet.getInt(7),
                            resultSet.getDouble(8),
                            resultSet.getInt(9),
                            resultSet.getDouble(10));
                }
            });
        } catch (Exception ex) {
            throw new RuntimeException();
        }
        return result;
    }
}
