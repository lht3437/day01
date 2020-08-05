package com.xiaoshu.dao;

import com.xiaoshu.base.dao.BaseMapper;
import com.xiaoshu.entity.Yuangong;
import com.xiaoshu.entity.YuangongExample;
import com.xiaoshu.entity.YuangongVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YuangongMapper extends BaseMapper<Yuangong> {
  List<YuangongVo> findList(YuangongVo yuangongVo);
}