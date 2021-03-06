package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2021-07-17 15:43:41
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
