package com.feedingfrenzy.feedme.seeder;

import com.feedingfrenzy.feedme.dto.FeedingDTO;
import com.feedingfrenzy.feedme.service.FeedingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Wessel van Dommelen <w.r.van.dommelen@st.hanze.nl>
 */

@Component
public class Seeder {

    private final FeedingService feedingService;

    @Autowired
    public Seeder(FeedingService feedingService) {
        this.feedingService = feedingService;
    }

    @EventListener
    public void seed(ContextRefreshedEvent event) {
        seedFeeding();
    }

    private void seedFeeding() {
        List<FeedingDTO> feedingDTOList = new ArrayList<>();
        feedingDTOList.add(new FeedingDTO(true, LocalDateTime.now(), 15));
        feedingDTOList.add(new FeedingDTO(true, LocalDateTime.now(), 13));
        feedingDTOList.add(new FeedingDTO(true, LocalDateTime.now(), 17));

        for (FeedingDTO feedingDTO : feedingDTOList) {
            feedingService.addNew(feedingDTO);
        }
    }
}
