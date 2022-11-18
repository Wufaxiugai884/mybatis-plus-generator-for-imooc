package com.fri.service.impl;

import com.fri.pojo.Users;
import com.fri.mapper.UsersMapper;
import com.fri.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author pzg
 * @since 2022-11-18
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

}
