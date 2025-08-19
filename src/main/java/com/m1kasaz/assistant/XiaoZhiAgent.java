package com.m1kasaz.assistant;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

import static dev.langchain4j.service.spring.AiServiceWiringMode.EXPLICIT;

@AiService(
        chatMemoryProvider = "chatMemoryProvider",
        tools = "AppointmentTools",
        contentRetriever = "contentRetrieverXiaozhiPincone" )//配置向量存储

public interface XiaoZhiAgent {
    @SystemMessage(fromResource = "xiaozhi-prompt-template.txt")
    String chat (@MemoryId Long memoryId, @UserMessage String message);
}
