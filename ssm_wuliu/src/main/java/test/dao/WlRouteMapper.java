package test.dao;

import java.util.List;
import test.entity.WlRoute;

public interface WlRouteMapper {
    int deleteByPrimaryKey(String route_num);

    int insert(WlRoute record);

    WlRoute selectByPrimaryKey(String route_num);

    List<WlRoute> selectAll();

    int updateByPrimaryKey(WlRoute record);
}