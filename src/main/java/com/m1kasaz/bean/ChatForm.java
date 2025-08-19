package com.m1kasaz.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChatForm {

    Long memoryId;

    //聊天内容
    String message;
}
