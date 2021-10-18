package com.feedingfrenzy.feedme.controller;

import com.feedingfrenzy.feedme.dto.FeedingDTO;
import com.feedingfrenzy.feedme.dto.VitaminDTO;
import com.feedingfrenzy.feedme.service.FeedingService;
import com.feedingfrenzy.feedme.service.VitaminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.util.List;

/**
 * @author Wessel van Dommelen <w.r.van.dommelen@st.hanze.nl>
 */

@Controller
public class DayController {

    private final FeedingService feedingService;
    private final VitaminService vitaminService;

    public DayController(FeedingService feedingService, VitaminService vitaminService) {
        this.vitaminService = vitaminService;
        this.feedingService = feedingService;
    }

    @GetMapping("/today")
    protected String showToday(Model model) {
        List<FeedingDTO> feedingsToday = feedingService.getFeedingsToday();
        boolean vitaminPresent = vitaminService.getVitaminToday() != null;
        if (!vitaminPresent) {
            model.addAttribute("vitamin", new VitaminDTO());
        }
        model.addAttribute("vitaminPresent", vitaminPresent);
        model.addAttribute("feedingList", feedingsToday);

        return "dayOverview";
    }

    @PostMapping("/vitamin/new")
    protected String addVitamin(Model model,
                                @ModelAttribute("vitamin") VitaminDTO vitaminDTO,
                                BindingResult result) {
        if (!result.hasErrors()) {
            vitaminDTO.setDateGiven(LocalDate.now());
            vitaminService.addNew(vitaminDTO);
        }
        return "redirect:/today";
    }
}
