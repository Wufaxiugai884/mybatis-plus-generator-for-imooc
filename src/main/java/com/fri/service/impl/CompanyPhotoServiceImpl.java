package com.fri.service.impl;

import com.fri.pojo.CompanyPhoto;
import com.fri.mapper.CompanyPhotoMapper;
import com.fri.service.CompanyPhotoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 企业相册表，本表只存企业上传的图片 服务实现类
 * </p>
 *
 * @author pzg
 * @since 2022-11-18
 */
@Service
public class CompanyPhotoServiceImpl extends ServiceImpl<CompanyPhotoMapper, CompanyPhoto> implements CompanyPhotoService {

}
