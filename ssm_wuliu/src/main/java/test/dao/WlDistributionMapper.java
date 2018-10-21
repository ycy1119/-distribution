package test.dao;

import java.util.List;
import test.entity.WlDistribution;

public interface WlDistributionMapper {
    int deleteByPrimaryKey(Integer distribution_id);

    int insert(WlDistribution record);

    WlDistribution selectByPrimaryKey(Integer distribution_id);

    List<WlDistribution> selectAll();

    int updateByPrimaryKey(WlDistribution record);
}