package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.xiaoshu.dao.UserMapper;
import com.xiaoshu.dao.YuangongMapper;
import com.xiaoshu.entity.User;
import com.xiaoshu.entity.UserExample;
import com.xiaoshu.entity.UserExample.Criteria;
import com.xiaoshu.entity.YuangongVo;

@Service
public class YuangongService {

	@Autowired
	YuangongMapper yuangongMapper;
	public PageInfo<YuangongVo> findList(YuangongVo yuangongVo,Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		List<YuangongVo> list = yuangongMapper.findList(yuangongVo);
		return new PageInfo<>(list);
		
	}
	
	public void deleteYuangong(Integer yid){
		yuangongMapper.deleteByPrimaryKey(yid);
	}
}