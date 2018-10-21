package test.entity;

public class WlRoute {
    private String route_num;

    private String route_name;

    private String startint_province;

    private String starting_cnum;

    private String middle_pnum;

    private String middle_cnum;

    private String end_pnum;

    private String end_cnum;

    private Long transport_price;

    private String note;

    public String getRoute_num() {
        return route_num;
    }

    public void setRoute_num(String route_num) {
        this.route_num = route_num == null ? null : route_num.trim();
    }

    public String getRoute_name() {
        return route_name;
    }

    public void setRoute_name(String route_name) {
        this.route_name = route_name == null ? null : route_name.trim();
    }

    public String getStartint_province() {
        return startint_province;
    }

    public void setStartint_province(String startint_province) {
        this.startint_province = startint_province == null ? null : startint_province.trim();
    }

    public String getStarting_cnum() {
        return starting_cnum;
    }

    public void setStarting_cnum(String starting_cnum) {
        this.starting_cnum = starting_cnum == null ? null : starting_cnum.trim();
    }

    public String getMiddle_pnum() {
        return middle_pnum;
    }

    public void setMiddle_pnum(String middle_pnum) {
        this.middle_pnum = middle_pnum == null ? null : middle_pnum.trim();
    }

    public String getMiddle_cnum() {
        return middle_cnum;
    }

    public void setMiddle_cnum(String middle_cnum) {
        this.middle_cnum = middle_cnum == null ? null : middle_cnum.trim();
    }

    public String getEnd_pnum() {
        return end_pnum;
    }

    public void setEnd_pnum(String end_pnum) {
        this.end_pnum = end_pnum == null ? null : end_pnum.trim();
    }

    public String getEnd_cnum() {
        return end_cnum;
    }

    public void setEnd_cnum(String end_cnum) {
        this.end_cnum = end_cnum == null ? null : end_cnum.trim();
    }

    public Long getTransport_price() {
        return transport_price;
    }

    public void setTransport_price(Long transport_price) {
        this.transport_price = transport_price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}