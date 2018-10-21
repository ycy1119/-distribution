package test.dao;

import java.util.List;
import test.entity.WlCar;

public interface WlCarMapper {
    int deleteByPrimaryKey(String car_id);

    int insert(WlCar record);

    WlCar selectByPrimaryKey(String car_id);

    List<WlCar> selectAll();

    int updateByPrimaryKey(WlCar record);
}