package com.fri.service.impl;

import com.fri.pojo.ChatMessage;
import com.fri.mapper.ChatMessageMapper;
import com.fri.service.ChatMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 聊天信息存储表 服务实现类
 * </p>
 *
 * @author pzg
 * @since 2022-11-18
 */
@Service
public class ChatMessageServiceImpl extends ServiceImpl<ChatMessageMapper, ChatMessage> implements ChatMessageService {

}
