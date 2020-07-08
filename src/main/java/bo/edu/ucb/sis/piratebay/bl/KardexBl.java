package bo.edu.ucb.sis.piratebay.bl;

import bo.edu.ucb.sis.piratebay.dao.DepartmentDao;
import bo.edu.ucb.sis.piratebay.dao.KardexDao;
import bo.edu.ucb.sis.piratebay.model.DepartamentModel;
import bo.edu.ucb.sis.piratebay.model.KardexModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KardexBl {
    private KardexDao kardexDao;

    @Autowired
    public KardexBl(KardexDao kardexDao) {
        this.kardexDao = kardexDao;
    }

    public List<KardexModel> findAllKardex(String code) {
        return this.kardexDao.findAllKardex(code);
    }
}
