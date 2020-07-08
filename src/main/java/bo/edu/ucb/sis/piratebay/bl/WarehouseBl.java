package bo.edu.ucb.sis.piratebay.bl;

import bo.edu.ucb.sis.piratebay.dao.WarehouseDao;
import bo.edu.ucb.sis.piratebay.model.WarehouseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseBl {
    private WarehouseDao warehouseDao;

    @Autowired
    public WarehouseBl(WarehouseDao warehouseDao) {
        this.warehouseDao = warehouseDao;
    }

    public List<WarehouseModel> findAllMovies(String nombre) {
        return this.warehouseDao.findAllMovies(nombre);
    }
}
