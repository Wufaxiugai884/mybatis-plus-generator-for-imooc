package com.fri.service.impl;

import com.fri.pojo.JobType;
import com.fri.mapper.JobTypeMapper;
import com.fri.service.JobTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 职位类别 服务实现类
 * </p>
 *
 * @author pzg
 * @since 2022-11-18
 */
@Service
public class JobTypeServiceImpl extends ServiceImpl<JobTypeMapper, JobType> implements JobTypeService {

}
