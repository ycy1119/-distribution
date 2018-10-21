package test.dao;

import java.util.List;
import test.entity.WlAdmin;

public interface WlAdminMapper {
    int deleteByPrimaryKey(String admin_id);

    int insert(WlAdmin record);

    WlAdmin selectByPrimaryKey(String admin_id);

    List<WlAdmin> selectAll();

    int updateByPrimaryKey(WlAdmin record);
}