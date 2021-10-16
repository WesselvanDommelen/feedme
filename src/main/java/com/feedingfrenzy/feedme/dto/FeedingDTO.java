package com.feedingfrenzy.feedme.dto;

import java.time.LocalDateTime;

/**
 * @author Wessel van Dommelen <w.r.van.dommelen@st.hanze.nl>
 */

public class FeedingDTO {

    private Integer urlId;
    private boolean breastMilk;
    private LocalDateTime timeGiven;
    private Integer timeSpent;

    public FeedingDTO(Integer urlId, boolean breastMilk, LocalDateTime timeGiven, Integer timeSpent) {
        this.urlId = urlId;
        this.breastMilk = breastMilk;
        this.timeGiven = timeGiven;
        this.timeSpent = timeSpent;
    }
}
