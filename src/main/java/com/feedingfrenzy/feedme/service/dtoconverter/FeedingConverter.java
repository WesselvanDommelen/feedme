package com.feedingfrenzy.feedme.service.dtoconverter;

import com.feedingfrenzy.feedme.dto.FeedingDTO;
import com.feedingfrenzy.feedme.model.Feeding;

/**
 * @author Wessel van Dommelen <w.r.van.dommelen@st.hanze.nl>
 */
public class FeedingConverter {

    public FeedingDTO toDTO(Feeding feeding) {
        return new FeedingDTO(
                feeding.getUrlId(),
                feeding.isBreastMilk(),
                feeding.getTimeGiven(),
                feeding.getTimeSpent()
        );
    }
}