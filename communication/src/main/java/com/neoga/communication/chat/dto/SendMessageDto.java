package com.neoga.communication.chat.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SendMessageDto {
    private String content;
    private Long senderId;
}
