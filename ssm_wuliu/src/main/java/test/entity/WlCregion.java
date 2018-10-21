package test.entity;

public class WlCregion {
    private String region_id;

    private String region_name;

    private String city_id;

    public String getRegion_id() {
        return region_id;
    }

    public void setRegion_id(String region_id) {
        this.region_id = region_id == null ? null : region_id.trim();
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name == null ? null : region_name.trim();
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id == null ? null : city_id.trim();
    }
}