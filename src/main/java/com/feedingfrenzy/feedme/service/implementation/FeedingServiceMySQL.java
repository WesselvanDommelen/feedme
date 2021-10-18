package com.feedingfrenzy.feedme.service.implementation;

import com.feedingfrenzy.feedme.dto.FeedingDTO;
import com.feedingfrenzy.feedme.model.Feeding;
import com.feedingfrenzy.feedme.repository.FeedingRepository;
import com.feedingfrenzy.feedme.service.FeedingService;
import com.feedingfrenzy.feedme.service.dtoconverter.FeedingConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Wessel van Dommelen <w.r.van.dommelen@st.hanze.nl>
 */

@Service
public class FeedingServiceMySQL implements FeedingService {

    private static final int DEFAULT_URL_ID = 5000;

    private final FeedingRepository feedingRepository;

    private final FeedingConverter feedingConverter;

    @Autowired
    public FeedingServiceMySQL(FeedingRepository feedingRepository) {
        this.feedingRepository = feedingRepository;

        feedingConverter = new FeedingConverter();
    }

    @Override
    public List<FeedingDTO> getAll() {
        List<Feeding> feedingList = feedingRepository.findAll();
        List<FeedingDTO> feedingDTOList = feedingConverter.toListDTO(feedingList);

        return feedingDTOList;
    }

    @Override
    public List<FeedingDTO> getFeedingsToday() {
        List<FeedingDTO> feedingDTOList = new ArrayList<>();
        List<FeedingDTO> allFeedingDTO = getAll();
        for (FeedingDTO feedingDTO : allFeedingDTO) {
            if (feedingDTO.getDateGiven().equals(LocalDate.now())) {
                feedingDTOList.add(feedingDTO);
            }
        }
        return feedingDTOList;
    }

    @Override
    public FeedingDTO addNew(FeedingDTO feedingDTO) {
        feedingDTO.setUrlId(findNextFeedingId());
        feedingRepository.save(feedingConverter.fromDTO(feedingDTO));
        return feedingDTO;
    }

    private Integer findNextFeedingId() {
        Integer maxId = feedingRepository.getMaxUrlId();
        if (maxId == null) {
            maxId = DEFAULT_URL_ID;
        }
        return ++maxId;
    }
}
