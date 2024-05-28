package com.mini_activity3.feedback_management_system.repository;


import com.mini_activity3.feedback_management_system.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository


public interface FeedBackRepository extends JpaRepository<Feedback, Long> {
    List<Feedback> findAllById(long id);

}
