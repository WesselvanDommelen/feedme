package com.feedingfrenzy.feedme.service.implementation;

import com.feedingfrenzy.feedme.dto.VitaminDTO;
import com.feedingfrenzy.feedme.model.Vitamin;
import com.feedingfrenzy.feedme.repository.VitaminRepository;
import com.feedingfrenzy.feedme.service.VitaminService;
import com.feedingfrenzy.feedme.service.dtoconverter.VitaminConverter;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Wessel van Dommelen <w.r.van.dommelen@st.hanze.nl>
 */

@Service
public class VitaminServiceMySQL implements VitaminService {

    private final VitaminRepository vitaminRepository;

    private final VitaminConverter vitaminConverter;

    public VitaminServiceMySQL(VitaminRepository vitaminRepository) {
        this.vitaminRepository = vitaminRepository;

        vitaminConverter = new VitaminConverter();
    }

    @Override
    public List<VitaminDTO> getAll() {
        List<Vitamin> vitaminList = vitaminRepository.findAll();
        return vitaminConverter.toListDTO(vitaminList);
    }

    @Override
    public VitaminDTO getVitaminToday() {
        List<VitaminDTO> vitaminList = getAll();
        for (VitaminDTO vitaminDTO : vitaminList) {
            if (vitaminDTO.getDateGiven().equals(LocalDate.now())) {
                return vitaminDTO;
            }
        }
        return null;
    }

    @Override
    public VitaminDTO addNew(VitaminDTO vitaminDTO) {
        Vitamin vitamin = vitaminConverter.fromDTO(vitaminDTO);
        vitaminRepository.save(vitamin);
        return vitaminConverter.toDTO(vitamin);
    }
}
