package com.feedingfrenzy.feedme.service;

import com.feedingfrenzy.feedme.dto.VitaminDTO;

import java.util.List;

public interface VitaminService {

    List<VitaminDTO> getAll();

    VitaminDTO getVitaminToday();

    VitaminDTO addNew(VitaminDTO vitaminDTO);
}
