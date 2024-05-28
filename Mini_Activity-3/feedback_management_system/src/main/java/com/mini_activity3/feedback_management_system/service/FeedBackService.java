package com.mini_activity3.feedback_management_system.service;

import java.util.List;
import com.mini_activity3.feedback_management_system.dto.FeedBackDTO;
import com.mini_activity3.feedback_management_system.dto.ResponseDTO;

public interface FeedBackService<FeedBack> {
    List<FeedBack> getFeedBacks();

    ResponseDTO createFeedBack(FeedBackDTO feedBackDTO);

}
