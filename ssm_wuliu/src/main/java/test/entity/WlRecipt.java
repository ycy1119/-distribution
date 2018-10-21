package test.entity;

import java.util.Date;

public class WlRecipt {
    private String origin_city;

    private String terminus_city;

    private String arrived_city;

    private Integer recipt_status;

    private Date recipt_time;

    private String note;

    public String getOrigin_city() {
        return origin_city;
    }

    public void setOrigin_city(String origin_city) {
        this.origin_city = origin_city == null ? null : origin_city.trim();
    }

    public String getTerminus_city() {
        return terminus_city;
    }

    public void setTerminus_city(String terminus_city) {
        this.terminus_city = terminus_city == null ? null : terminus_city.trim();
    }

    public String getArrived_city() {
        return arrived_city;
    }

    public void setArrived_city(String arrived_city) {
        this.arrived_city = arrived_city == null ? null : arrived_city.trim();
    }

    public Integer getRecipt_status() {
        return recipt_status;
    }

    public void setRecipt_status(Integer recipt_status) {
        this.recipt_status = recipt_status;
    }

    public Date getRecipt_time() {
        return recipt_time;
    }

    public void setRecipt_time(Date recipt_time) {
        this.recipt_time = recipt_time;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}