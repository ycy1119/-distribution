package test.entity;

public class WlDistribution {
    private Integer distribution_id;

    private String distribution_name;

    private String province_id;

    private String city_id;

    private String admin_id;

    private String phone;

    private String distribution_address;

    private String note;

    public Integer getDistribution_id() {
        return distribution_id;
    }

    public void setDistribution_id(Integer distribution_id) {
        this.distribution_id = distribution_id;
    }

    public String getDistribution_name() {
        return distribution_name;
    }

    public void setDistribution_name(String distribution_name) {
        this.distribution_name = distribution_name == null ? null : distribution_name.trim();
    }

    public String getProvince_id() {
        return province_id;
    }

    public void setProvince_id(String province_id) {
        this.province_id = province_id == null ? null : province_id.trim();
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id == null ? null : city_id.trim();
    }

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id == null ? null : admin_id.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getDistribution_address() {
        return distribution_address;
    }

    public void setDistribution_address(String distribution_address) {
        this.distribution_address = distribution_address == null ? null : distribution_address.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}