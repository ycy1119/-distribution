package test.entity;

public class WlOrder {
    private String order_id;

    private Integer order_type;

    private String order_num;

    private String cargo_name;

    private Integer cargo_weight;

    private String mail_people;

    private String mail_address;

    private String consignee_address;

    private Integer order_start;

    private String mail_phone;

    private String consignee;

    private String consignee_phone;

    private String starting_city;

    private String middle_city;

    private String end_city;

    private Long shipping_price;

    private Long delivery_price;

    private String count_price;

    private String car;

    private String note;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id == null ? null : order_id.trim();
    }

    public Integer getOrder_type() {
        return order_type;
    }

    public void setOrder_type(Integer order_type) {
        this.order_type = order_type;
    }

    public String getOrder_num() {
        return order_num;
    }

    public void setOrder_num(String order_num) {
        this.order_num = order_num == null ? null : order_num.trim();
    }

    public String getCargo_name() {
        return cargo_name;
    }

    public void setCargo_name(String cargo_name) {
        this.cargo_name = cargo_name == null ? null : cargo_name.trim();
    }

    public Integer getCargo_weight() {
        return cargo_weight;
    }

    public void setCargo_weight(Integer cargo_weight) {
        this.cargo_weight = cargo_weight;
    }

    public String getMail_people() {
        return mail_people;
    }

    public void setMail_people(String mail_people) {
        this.mail_people = mail_people == null ? null : mail_people.trim();
    }

    public String getMail_address() {
        return mail_address;
    }

    public void setMail_address(String mail_address) {
        this.mail_address = mail_address == null ? null : mail_address.trim();
    }

    public String getConsignee_address() {
        return consignee_address;
    }

    public void setConsignee_address(String consignee_address) {
        this.consignee_address = consignee_address == null ? null : consignee_address.trim();
    }

    public Integer getOrder_start() {
        return order_start;
    }

    public void setOrder_start(Integer order_start) {
        this.order_start = order_start;
    }

    public String getMail_phone() {
        return mail_phone;
    }

    public void setMail_phone(String mail_phone) {
        this.mail_phone = mail_phone == null ? null : mail_phone.trim();
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getConsignee_phone() {
        return consignee_phone;
    }

    public void setConsignee_phone(String consignee_phone) {
        this.consignee_phone = consignee_phone == null ? null : consignee_phone.trim();
    }

    public String getStarting_city() {
        return starting_city;
    }

    public void setStarting_city(String starting_city) {
        this.starting_city = starting_city == null ? null : starting_city.trim();
    }

    public String getMiddle_city() {
        return middle_city;
    }

    public void setMiddle_city(String middle_city) {
        this.middle_city = middle_city == null ? null : middle_city.trim();
    }

    public String getEnd_city() {
        return end_city;
    }

    public void setEnd_city(String end_city) {
        this.end_city = end_city == null ? null : end_city.trim();
    }

    public Long getShipping_price() {
        return shipping_price;
    }

    public void setShipping_price(Long shipping_price) {
        this.shipping_price = shipping_price;
    }

    public Long getDelivery_price() {
        return delivery_price;
    }

    public void setDelivery_price(Long delivery_price) {
        this.delivery_price = delivery_price;
    }

    public String getCount_price() {
        return count_price;
    }

    public void setCount_price(String count_price) {
        this.count_price = count_price == null ? null : count_price.trim();
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car == null ? null : car.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}