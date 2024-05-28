package com.mini_activity3.feedback_management_system.serviceimpl;

import com.mini_activity3.feedback_management_system.dto.FeedBackDTO;
import com.mini_activity3.feedback_management_system.dto.ResponseDTO;
import com.mini_activity3.feedback_management_system.entity.Feedback;
import com.mini_activity3.feedback_management_system.repository.FeedBackRepository;
import com.mini_activity3.feedback_management_system.service.FeedBackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class FeedBackServiceImpl implements FeedBackService {
    @Autowired
    FeedBackRepository feedBackRepository;

    @Override
    public List<Feedback> getFeedBacks() {
        return feedBackRepository.findAll();
    }



    @Override
    public ResponseDTO createFeedBack(FeedBackDTO feedBackDTO) {


        Feedback feedBack = new Feedback();

        feedBack.setUserId(feedBackDTO.getUserId());
        feedBack.setComments(feedBackDTO.getComments());
        feedBack.setRatings(feedBackDTO.getRatings());
        feedBackRepository.save(feedBack);

        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setMessage("Feedback sent successfully");
        responseDTO.setStatus(200);
        return responseDTO;
    }

}
