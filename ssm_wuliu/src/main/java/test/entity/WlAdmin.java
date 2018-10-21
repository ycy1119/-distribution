package test.entity;

public class WlAdmin {
    private String admin_id;

    private String admin_name;

    private Integer admin_sex;

    private String user_id;

    private Integer admin_start;

    private String admin_city;

    private String admin_address;

    private String admin_pwd;

    private String admin_phone;

    private String note;

    public String getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(String admin_id) {
        this.admin_id = admin_id == null ? null : admin_id.trim();
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name == null ? null : admin_name.trim();
    }

    public Integer getAdmin_sex() {
        return admin_sex;
    }

    public void setAdmin_sex(Integer admin_sex) {
        this.admin_sex = admin_sex;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id == null ? null : user_id.trim();
    }

    public Integer getAdmin_start() {
        return admin_start;
    }

    public void setAdmin_start(Integer admin_start) {
        this.admin_start = admin_start;
    }

    public String getAdmin_city() {
        return admin_city;
    }

    public void setAdmin_city(String admin_city) {
        this.admin_city = admin_city == null ? null : admin_city.trim();
    }

    public String getAdmin_address() {
        return admin_address;
    }

    public void setAdmin_address(String admin_address) {
        this.admin_address = admin_address == null ? null : admin_address.trim();
    }

    public String getAdmin_pwd() {
        return admin_pwd;
    }

    public void setAdmin_pwd(String admin_pwd) {
        this.admin_pwd = admin_pwd == null ? null : admin_pwd.trim();
    }

    public String getAdmin_phone() {
        return admin_phone;
    }

    public void setAdmin_phone(String admin_phone) {
        this.admin_phone = admin_phone == null ? null : admin_phone.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}