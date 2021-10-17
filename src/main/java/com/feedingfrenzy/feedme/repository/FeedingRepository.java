package com.feedingfrenzy.feedme.repository;

import com.feedingfrenzy.feedme.model.Feeding;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface FeedingRepository extends JpaRepository<Feeding, Integer> {

    Optional<Feeding> findByUrlId(Integer urlId);

    @Query("SELECT MAX(urlId) FROM Feeding")
    Integer getMaxUrlId();
}
