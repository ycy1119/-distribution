package test.entity;

import java.util.Date;

public class WlCar {
    private String car_id;

    private String car_model;

    private String produce_place;

    private String route_num;

    private Date produce_date;

    private Date buy_date;

    private String note;

    public String getCar_id() {
        return car_id;
    }

    public void setCar_id(String car_id) {
        this.car_id = car_id == null ? null : car_id.trim();
    }

    public String getCar_model() {
        return car_model;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model == null ? null : car_model.trim();
    }

    public String getProduce_place() {
        return produce_place;
    }

    public void setProduce_place(String produce_place) {
        this.produce_place = produce_place == null ? null : produce_place.trim();
    }

    public String getRoute_num() {
        return route_num;
    }

    public void setRoute_num(String route_num) {
        this.route_num = route_num == null ? null : route_num.trim();
    }

    public Date getProduce_date() {
        return produce_date;
    }

    public void setProduce_date(Date produce_date) {
        this.produce_date = produce_date;
    }

    public Date getBuy_date() {
        return buy_date;
    }

    public void setBuy_date(Date buy_date) {
        this.buy_date = buy_date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}