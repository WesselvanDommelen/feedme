package com.feedingfrenzy.feedme.service.dtoconverter;

import com.feedingfrenzy.feedme.dto.ExcrementDTO;
import com.feedingfrenzy.feedme.model.Excrement;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wessel van Dommelen <w.r.van.dommelen@st.hanze.nl>
 */
public class ExcrementConverter {

    public ExcrementDTO toDTO(Excrement excrement) {
        return new ExcrementDTO(excrement.getDate(), excrement.isPoo(), excrement.isPee(), excrement.getNotes());
    }

    public List<ExcrementDTO> toListDTO(List<Excrement> excrementList) {
        List<ExcrementDTO> excrementDTOList = new ArrayList<>();
        for (Excrement excrement : excrementList) {
            excrementDTOList.add(toDTO(excrement));
        }
        return excrementDTOList;
    }

    public Excrement fromDTO(ExcrementDTO excrementDTO) {
        return new Excrement(
                excrementDTO.getDate(),
                excrementDTO.isPoo(),
                excrementDTO.isPee(),
                excrementDTO.getNotes());
    }
}
