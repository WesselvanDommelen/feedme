package com.feedingfrenzy.feedme.service.implementation;

import com.feedingfrenzy.feedme.dto.ExcrementDTO;
import com.feedingfrenzy.feedme.model.Excrement;
import com.feedingfrenzy.feedme.repository.ExcrementRepository;
import com.feedingfrenzy.feedme.service.ExcrementService;
import com.feedingfrenzy.feedme.service.dtoconverter.ExcrementConverter;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Wessel van Dommelen <w.r.van.dommelen@st.hanze.nl>
 */

@Service
public class ExcrementServiceMySQL implements ExcrementService {

    private final ExcrementRepository excrementRepository;

    private final ExcrementConverter excrementConverter;

    public ExcrementServiceMySQL(ExcrementRepository excrementRepository) {
        this.excrementRepository = excrementRepository;

        excrementConverter = new ExcrementConverter();
    }

    @Override
    public List<ExcrementDTO> getAll() {
        List<Excrement> excrementList = excrementRepository.findAll();
        return excrementConverter.toListDTO(excrementList);
    }

    @Override
    public List<ExcrementDTO> getExcrementToday() {
        List<ExcrementDTO> pooTodayList = new ArrayList<>();
        List<ExcrementDTO> excrementDTOList = getAll();
        for (ExcrementDTO excrementDTO : excrementDTOList) {
            if (excrementDTO.getDate().equals(LocalDate.now())) {
                pooTodayList.add(excrementDTO);
            }
        }
        return pooTodayList;
    }

    @Override
    public List<String> getNotesToday() {
        List<String> noteList = new ArrayList<>();
        for (ExcrementDTO excrementDTO : getExcrementToday()) {
            if (!excrementDTO.getNotes().equals("")) {
                noteList.add(excrementDTO.getNotes());
            }
        }
        return noteList;
    }

    @Override
    public Integer getAmountPoo() {
        int counter = 0;
        for (ExcrementDTO excrementDTO : getExcrementToday()) {
            if (excrementDTO.isPoo()) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public Integer getAmountPee() {
        int counter = 0;
        for (ExcrementDTO excrementDTO : getExcrementToday()) {
            if (excrementDTO.isPee()) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public ExcrementDTO addNew(ExcrementDTO excrementDTO) {
        excrementRepository.save(excrementConverter.fromDTO(excrementDTO));
        return excrementDTO;
    }
}
