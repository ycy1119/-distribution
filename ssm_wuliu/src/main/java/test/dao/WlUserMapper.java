package test.dao;

import java.util.List;
import test.entity.WlUser;

public interface WlUserMapper {
    int deleteByPrimaryKey(String user_id);

    int insert(WlUser record);

    WlUser selectByPrimaryKey(String user_id);

    List<WlUser> selectAll();

    int updateByPrimaryKey(WlUser record);
}