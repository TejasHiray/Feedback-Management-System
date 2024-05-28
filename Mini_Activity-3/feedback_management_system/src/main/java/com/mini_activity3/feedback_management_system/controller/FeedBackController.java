package com.mini_activity3.feedback_management_system.controller;


import com.mini_activity3.feedback_management_system.dto.ResponseDTO;
import com.mini_activity3.feedback_management_system.dto.FeedBackDTO;

import com.mini_activity3.feedback_management_system.repository.FeedBackRepository;
import com.mini_activity3.feedback_management_system.service.FeedBackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
public class FeedBackController<FeedBackDTO, FeedBack> {
    @Autowired
    private FeedBackService feedBackService;

    @Autowired
    private FeedBackRepository feedBackRepository;

    @GetMapping("/feedback/get")
    public List<FeedBack> getFeedBack(){
        log.info("getting all feedbacks");
        return feedBackService.getFeedBacks();
    }

    @GetMapping("/feedback/get/{id}")
    public Optional getByID(@PathVariable long id){

        return feedBackRepository.findById(id);
    }

    @PostMapping("/feedback/write")
    public ResponseDTO createFeedBack(@RequestBody FeedBackDTO feedBackDTO){
        log.info("Writing feedback");
        return feedBackService.createFeedBack((com.mini_activity3.feedback_management_system.dto.FeedBackDTO) feedBackDTO);
    }


}
