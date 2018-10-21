package test.dao;

import java.util.List;
import test.entity.WlOrder;

public interface WlOrderMapper {
    int deleteByPrimaryKey(String order_id);

    int insert(WlOrder record);

    WlOrder selectByPrimaryKey(String order_id);

    List<WlOrder> selectAll();

    int updateByPrimaryKey(WlOrder record);
}