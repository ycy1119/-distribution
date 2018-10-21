package test.dao;

import java.util.List;
import test.entity.WlCity;

public interface WlCityMapper {
    int deleteByPrimaryKey(String city_id);

    int insert(WlCity record);

    WlCity selectByPrimaryKey(String city_id);

    List<WlCity> selectAll();

    int updateByPrimaryKey(WlCity record);
}