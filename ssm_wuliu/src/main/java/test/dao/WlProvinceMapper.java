package test.dao;

import java.util.List;
import test.entity.WlProvince;

public interface WlProvinceMapper {
    int deleteByPrimaryKey(String province_id);

    int insert(WlProvince record);

    WlProvince selectByPrimaryKey(String province_id);

    List<WlProvince> selectAll();

    int updateByPrimaryKey(WlProvince record);
}