package bo.edu.ucb.sis.piratebay.model;

public class DepartamentModel {
    private int department_id;
    private String name_department;

    public DepartamentModel() {
    }

    public DepartamentModel(int department_id, String name_department) {
        this.department_id  = department_id;
        this.name_department = name_department;
    }


    public int getDepartment_id() {
        return department_id;
    }

    public String getName_department() {
        return name_department;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public void setName_department(String name_department) {
        this.name_department = name_department;
    }

    @Override
    public String toString() {
        return "departmentModel{" +
                "department_id=" + department_id +
                ", name_department='" + name_department + '\'' +
                '}';
    }
}
