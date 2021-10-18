package com.feedingfrenzy.feedme.controller;

import com.feedingfrenzy.feedme.dto.FeedingDTO;
import com.feedingfrenzy.feedme.service.FeedingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author Wessel van Dommelen <w.r.van.dommelen@st.hanze.nl>
 */

@Controller
public class FeedingController {

    private final FeedingService feedingService;

    public FeedingController(FeedingService feedingService) {
        this.feedingService = feedingService;
    }

    @GetMapping({"/", "/feedings"})
    protected String showFeedings(Model model) {
        List<FeedingDTO> allFeedings = feedingService.getAll();

        model.addAttribute("feedingList", allFeedings);

        return "feedingOverview";
    }

    @GetMapping("/feeding/new")
    protected String showFeedingForm(Model model) {
        model.addAttribute("feeding", new FeedingDTO());

        return "feedingForm";
    }

    @PostMapping("/feeding/new")
    protected String saveFeeding(Model model,
                                 @ModelAttribute("feeding") FeedingDTO feedingDTO,
                                 BindingResult result) {
        if (!result.hasErrors()) {
            feedingService.addNew(feedingDTO);
        }

        return "redirect:/";
    }
}
