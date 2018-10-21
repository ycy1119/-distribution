package test.dao;

import java.util.List;
import test.entity.WlCregion;

public interface WlCregionMapper {
    int deleteByPrimaryKey(String region_id);

    int insert(WlCregion record);

    WlCregion selectByPrimaryKey(String region_id);

    List<WlCregion> selectAll();

    int updateByPrimaryKey(WlCregion record);
}