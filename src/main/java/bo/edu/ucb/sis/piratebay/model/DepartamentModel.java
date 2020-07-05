package bo.edu.ucb.sis.piratebay.model;

public class DepartamentModel {
    private int warehouse_id;
    private String warehouse_name;

    public DepartamentModel() {
    }

    public DepartamentModel(int warehouse_id, String warehouse_name) {
        this.warehouse_id = warehouse_id;
        this.warehouse_name = warehouse_name;
    }

    public int getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(int warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public String getWarehouse_name() {
        return warehouse_name;
    }

    public void setWarehouse_name(String warehouse_name) {
        this.warehouse_name = warehouse_name;
    }

    @Override
    public String toString() {
        return "DepartamentModel{" +
                "warehouse_id=" + warehouse_id +
                ", warehouse_name='" + warehouse_name + '\'' +
                '}';
    }
}
