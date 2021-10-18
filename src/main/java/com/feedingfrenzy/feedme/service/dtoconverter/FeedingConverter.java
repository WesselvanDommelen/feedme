package com.feedingfrenzy.feedme.service.dtoconverter;

import com.feedingfrenzy.feedme.dto.FeedingDTO;
import com.feedingfrenzy.feedme.model.Feeding;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wessel van Dommelen <w.r.van.dommelen@st.hanze.nl>
 */
public class FeedingConverter {

    public FeedingDTO toDTO(Feeding feeding) {
        return new FeedingDTO(
                feeding.getUrlId(),
                feeding.isBreastMilk(),
                feeding.getTimeGiven(),
                feeding.getDateGiven(),
                feeding.getTimeSpent(),
                feeding.getBreast()
        );
    }

    public List<FeedingDTO> toListDTO(List<Feeding> feedingList) {
        List<FeedingDTO> feedingDTOList = new ArrayList<>();
        for (Feeding feeding : feedingList) {
            feedingDTOList.add(toDTO(feeding));
        }
        return feedingDTOList;
    }

    public Feeding fromDTO(FeedingDTO feedingDTO) {
        return new Feeding(
                feedingDTO.getUrlId(),
                feedingDTO.isBreastMilk(),
                feedingDTO.getTimeGiven(),
                feedingDTO.getDateGiven(),
                feedingDTO.getTimeSpent(),
                feedingDTO.getBreast()
        );
    }
}
