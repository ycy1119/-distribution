package test.entity;

import java.util.Date;

public class WlCustomer {
    private String customer_id;

    private String customer_name;

    private Integer customer_sex;

    private String user_id;

    private String customer_pwd;

    private String customer_phone;

    private Date customer_birth;

    private String customer_address;

    private String note;

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id == null ? null : customer_id.trim();
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name == null ? null : customer_name.trim();
    }

    public Integer getCustomer_sex() {
        return customer_sex;
    }

    public void setCustomer_sex(Integer customer_sex) {
        this.customer_sex = customer_sex;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id == null ? null : user_id.trim();
    }

    public String getCustomer_pwd() {
        return customer_pwd;
    }

    public void setCustomer_pwd(String customer_pwd) {
        this.customer_pwd = customer_pwd == null ? null : customer_pwd.trim();
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone == null ? null : customer_phone.trim();
    }

    public Date getCustomer_birth() {
        return customer_birth;
    }

    public void setCustomer_birth(Date customer_birth) {
        this.customer_birth = customer_birth;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address == null ? null : customer_address.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}