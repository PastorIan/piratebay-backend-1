package bo.edu.ucb.sis.piratebay.bl;

import bo.edu.ucb.sis.piratebay.dao.KardexDao;
import bo.edu.ucb.sis.piratebay.dao.PepsDao;
import bo.edu.ucb.sis.piratebay.model.KardexModel;
import bo.edu.ucb.sis.piratebay.model.PepsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PepsBl {

    private PepsDao pepsDao;

    @Autowired
    public PepsBl(PepsDao pepsDao) {
        this.pepsDao = pepsDao;
    }

    public List<PepsModel> findAllAttributes(String code) {
        return this.pepsDao.findAllAttributes(code);
    }
}
