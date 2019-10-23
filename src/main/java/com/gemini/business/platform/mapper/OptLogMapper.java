package com.gemini.business.platform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gemini.business.platform.po.OptLogPo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 操作日志表
 *
 * @author 小明不读书
 */
@Mapper
public interface OptLogMapper extends BaseMapper<OptLogPo> {
}
