package com.mini_activity3.feedback_management_system.dto;


import lombok.Getter;
import lombok.Data;
import lombok.Setter;

@Getter
@Setter
@Data
public class FeedBackDTO {
    private long id;
    private long userId;
    private String comments;
    private Integer ratings;

}
