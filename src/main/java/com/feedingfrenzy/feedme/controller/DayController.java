package com.feedingfrenzy.feedme.controller;

import com.feedingfrenzy.feedme.dto.FeedingDTO;
import com.feedingfrenzy.feedme.service.FeedingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author Wessel van Dommelen <w.r.van.dommelen@st.hanze.nl>
 */

@Controller
public class DayController {

    private final FeedingService feedingService;

    public DayController(FeedingService feedingService) {
        this.feedingService = feedingService;
    }

    @GetMapping("/today")
    protected String showToday(Model model) {
        List<FeedingDTO> feedingsToday = feedingService.getFeedingsToday();

        model.addAttribute("feedingList", feedingsToday);

        return "dayOverview";
    }
}
