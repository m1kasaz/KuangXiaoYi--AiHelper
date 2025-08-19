package com.m1kasaz.controller;


import com.m1kasaz.assistant.XiaoZhiAgent;
import com.m1kasaz.bean.ChatForm;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.element.Name;

@RequestMapping
@RestController("/xiaozhi")
@Tag(name = "矿大小智")
public class XiaoZhiController {

    @Autowired
    private XiaoZhiAgent xiaoZhiAgent;

    @PostMapping("/chat")
    @Operation(summary = "对话")
    public String chat (@RequestBody ChatForm chatForm) {
        return xiaoZhiAgent.chat(chatForm.getMemoryId(), chatForm.getMessage());
    }
}
