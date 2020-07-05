package bo.edu.ucb.sis.piratebay.model;

public class WarehouseModel {
    private String product_code;
    private String product_name;
    private String data_type;
    private String create_date;
    private String provider_name;
    private int commit;

    public WarehouseModel() {
    }

    public WarehouseModel(String product_code, String product_name, String data_type, String create_date, String provider_name, int commit) {
        this.product_code = product_code;
        this.product_name = product_name;
        this.data_type = data_type;
        this.create_date = create_date;
        this.provider_name = provider_name;
        this.commit = commit;
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

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getProvider_name() {
        return provider_name;
    }

    public void setProvider_name(String provider_name) {
        this.provider_name = provider_name;
    }

    public int getCommit() {
        return commit;
    }

    public void setCommit(int commit) {
        this.commit = commit;
    }

    @Override
    public String toString() {
        return "WarehouseModel{" +
                "product_code='" + product_code + '\'' +
                ", product_name='" + product_name + '\'' +
                ", data_type='" + data_type + '\'' +
                ", create_date='" + create_date + '\'' +
                ", provider_name='" + provider_name + '\'' +
                ", commit=" + commit +
                '}';
    }
}
