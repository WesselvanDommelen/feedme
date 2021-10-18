package com.feedingfrenzy.feedme.service;

import com.feedingfrenzy.feedme.dto.FeedingDTO;

import java.util.List;

public interface FeedingService {

    List<FeedingDTO> getAll();

    List<FeedingDTO> getFeedingsToday();

    FeedingDTO addNew(FeedingDTO feedingDTO);
}
