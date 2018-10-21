package test.entity;

public class WlDarea {
    private Integer darea_id;

    private String darea_name;

    private Long darea_price;

    private String city_id;

    private String note;

    public Integer getDarea_id() {
        return darea_id;
    }

    public void setDarea_id(Integer darea_id) {
        this.darea_id = darea_id;
    }

    public String getDarea_name() {
        return darea_name;
    }

    public void setDarea_name(String darea_name) {
        this.darea_name = darea_name == null ? null : darea_name.trim();
    }

    public Long getDarea_price() {
        return darea_price;
    }

    public void setDarea_price(Long darea_price) {
        this.darea_price = darea_price;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id == null ? null : city_id.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}