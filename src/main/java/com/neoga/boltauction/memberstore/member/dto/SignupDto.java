package com.neoga.boltauction.memberstore.member.dto;

import lombok.*;

@Builder @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class SignupDto {
    private String uid;
    private String passwd;
    private String name;
}
