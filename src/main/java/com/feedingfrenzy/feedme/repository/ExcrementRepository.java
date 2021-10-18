package com.feedingfrenzy.feedme.repository;

import com.feedingfrenzy.feedme.model.Excrement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExcrementRepository extends JpaRepository<Excrement, Integer> {
}
