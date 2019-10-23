package com.gemini.business.platform.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gemini.business.platform.po.ErrorLogPo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 错误日志表
 *
 * @author 小明不读书
 */
@Mapper
public interface ErrorLogMapper extends BaseMapper<ErrorLogPo> {
}
