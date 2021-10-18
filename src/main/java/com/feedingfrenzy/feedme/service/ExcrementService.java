package com.feedingfrenzy.feedme.service;

import com.feedingfrenzy.feedme.dto.ExcrementDTO;

import java.util.List;

public interface ExcrementService {

    List<ExcrementDTO> getAll();

    List<ExcrementDTO> getExcrementToday();

    List<String> getNotesToday();

    Integer getAmountPoo();

    Integer getAmountPee();

    ExcrementDTO addNew(ExcrementDTO excrementDTO);
}
