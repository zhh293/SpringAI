package org.example.springai1.最新的聊天API;

import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Redis聊天内存使用示例
 */
@Service
public class RedisChatMemoryUsageExample {
    
    private final ChatMemory chatMemory;
    
    @Autowired
    public RedisChatMemoryUsageExample(RedisChatMemory redisChatMemory) {
        // 使用基于Redis的聊天内存实例
        this.chatMemory = redisChatMemory;
    }
    
    public ChatMemory getChatMemory() {
        return chatMemory;
    }
}