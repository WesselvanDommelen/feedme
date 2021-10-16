package com.feedingfrenzy.feedme.repository;

import com.feedingfrenzy.feedme.model.Feeding;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedingRepository extends JpaRepository<Feeding, Integer> {
}
