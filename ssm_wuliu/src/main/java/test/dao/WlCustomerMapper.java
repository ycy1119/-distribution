package test.dao;

import java.util.List;
import test.entity.WlCustomer;

public interface WlCustomerMapper {
    int deleteByPrimaryKey(String customer_id);

    int insert(WlCustomer record);

    WlCustomer selectByPrimaryKey(String customer_id);

    List<WlCustomer> selectAll();

    int updateByPrimaryKey(WlCustomer record);
}