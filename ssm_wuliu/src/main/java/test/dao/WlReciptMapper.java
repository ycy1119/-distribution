package test.dao;

import java.util.List;
import test.entity.WlRecipt;

public interface WlReciptMapper {
    int deleteByPrimaryKey(String origin_city);

    int insert(WlRecipt record);

    WlRecipt selectByPrimaryKey(String origin_city);

    List<WlRecipt> selectAll();

    int updateByPrimaryKey(WlRecipt record);
}