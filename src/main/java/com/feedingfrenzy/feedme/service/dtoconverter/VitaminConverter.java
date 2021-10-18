package com.feedingfrenzy.feedme.service.dtoconverter;

import com.feedingfrenzy.feedme.dto.VitaminDTO;
import com.feedingfrenzy.feedme.model.Vitamin;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wessel van Dommelen <w.r.van.dommelen@st.hanze.nl>
 */
public class VitaminConverter {

    public VitaminDTO toDTO(Vitamin vitamin) {
        return new VitaminDTO(vitamin.isGiven(), vitamin.getDateGiven());
    }

    public List<VitaminDTO> toListDTO(List<Vitamin> vitaminList) {
        List<VitaminDTO> vitaminDTOList = new ArrayList<>();
        for (Vitamin vitamin : vitaminList) {
            vitaminDTOList.add(toDTO(vitamin));
        }
        return vitaminDTOList;
    }

    public Vitamin fromDTO(VitaminDTO vitaminDTO) {
        return new Vitamin(vitaminDTO.isGiven(), vitaminDTO.getDateGiven());
    }
}
