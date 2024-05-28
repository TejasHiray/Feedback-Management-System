package com.mini_activity3.feedback_management_system.dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data

public class ResponseDTO {
    private Integer status;
    private String message;
}
