package bo.edu.ucb.sis.piratebay.model;

public class PepsModel {
    private String product_code;
    private String product_name;
    private String data_type;
    private String warehouse_address;
    private String provider_name;
    private String warehouse_name;

    public PepsModel() {
    }

    public PepsModel(String product_code, String product_name, String data_type, String warehouse_address, String provider_name, String warehouse_name) {
        this.product_code = product_code;
        this.product_name = product_name;
        this.data_type = data_type;
        this.warehouse_address = warehouse_address;
        this.provider_name = provider_name;
        this.warehouse_name = warehouse_name;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getData_type() {
        return data_type;
    }

    public void setData_type(String data_type) {
        this.data_type = data_type;
    }

    public String getWarehouse_address() {
        return warehouse_address;
    }

    public void setWarehouse_address(String warehouse_address) {
        this.warehouse_address = warehouse_address;
    }

    public String getProvider_name() {
        return provider_name;
    }

    public void setProvider_name(String provider_name) {
        this.provider_name = provider_name;
    }

    public String getWarehouse_name() {
        return warehouse_name;
    }

    public void setWarehouse_name(String warehouse_name) {
        this.warehouse_name = warehouse_name;
    }

    @Override
    public String toString() {
        return "PepsModel{" +
                "product_code='" + product_code + '\'' +
                ", product_name='" + product_name + '\'' +
                ", data_type='" + data_type + '\'' +
                ", warehouse_address='" + warehouse_address + '\'' +
                ", provider_name='" + provider_name + '\'' +
                ", warehouse_name='" + warehouse_name + '\'' +
                '}';
    }
}
