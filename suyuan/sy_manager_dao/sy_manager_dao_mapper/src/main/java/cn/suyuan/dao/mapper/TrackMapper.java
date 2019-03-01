package cn.suyuan.dao.mapper;

import cn.suyuan.dao.pojo.Track;
import cn.suyuan.dao.pojo.TrackExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TrackMapper {
    int countByExample(TrackExample example);

    int deleteByExample(TrackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Track record);

    int insertSelective(Track record);

    List<Track> selectByExampleWithBLOBs(TrackExample example);

    List<Track> selectByExample(TrackExample example);

    Track selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Track record, @Param("example") TrackExample example);

    int updateByExampleWithBLOBs(@Param("record") Track record, @Param("example") TrackExample example);

    int updateByExample(@Param("record") Track record, @Param("example") TrackExample example);

    int updateByPrimaryKeySelective(Track record);

    int updateByPrimaryKeyWithBLOBs(Track record);

    int updateByPrimaryKey(Track record);
}