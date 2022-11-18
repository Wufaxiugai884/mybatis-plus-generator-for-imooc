package com.fri.mapper;

import com.fri.pojo.Interview;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 面试邀约表
本表为次表，可做冗余，可以用mongo或者es替代 Mapper 接口
 * </p>
 *
 * @author pzg
 * @since 2022-11-18
 */
public interface InterviewMapper extends BaseMapper<Interview> {

}
