package com.feedingfrenzy.feedme.service;

import com.feedingfrenzy.feedme.dto.FeedingDTO;

import java.util.List;

public interface FeedingService {

    List<FeedingDTO> getAll();

    FeedingDTO addNew(FeedingDTO feedingDTO);
}
