package bo.edu.ucb.sis.piratebay.bl;

import bo.edu.ucb.sis.piratebay.dao.DepartmentDao;
import bo.edu.ucb.sis.piratebay.model.DepartamentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentBl {
    private DepartmentDao departmentDao;

    @Autowired
    public DepartmentBl(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    public List<DepartamentModel> findAllCities() {
        return this.departmentDao.findAllCities();
    }
}
