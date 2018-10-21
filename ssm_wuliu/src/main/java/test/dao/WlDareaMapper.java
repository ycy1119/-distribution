package test.dao;

import java.util.List;
import test.entity.WlDarea;

public interface WlDareaMapper {
    int deleteByPrimaryKey(Integer darea_id);

    int insert(WlDarea record);

    WlDarea selectByPrimaryKey(Integer darea_id);

    List<WlDarea> selectAll();

    int updateByPrimaryKey(WlDarea record);
}