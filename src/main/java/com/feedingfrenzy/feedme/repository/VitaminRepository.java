package com.feedingfrenzy.feedme.repository;

import com.feedingfrenzy.feedme.model.Vitamin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VitaminRepository extends JpaRepository<Vitamin, Integer> {
}
