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

    public FeedingDTO(boolean breastMilk, LocalDateTime timeGiven, Integer timeSpent) {
        this.breastMilk = breastMilk;
        this.timeGiven = timeGiven;
        this.timeSpent = timeSpent;
    }

    public Integer getUrlId() {
        return urlId;
    }

    public void setUrlId(Integer urlId) {
        this.urlId = urlId;
    }

    public boolean isBreastMilk() {
        return breastMilk;
    }

    public void setBreastMilk(boolean breastMilk) {
        this.breastMilk = breastMilk;
    }

    public LocalDateTime getTimeGiven() {
        return timeGiven;
    }

    public void setTimeGiven(LocalDateTime timeGiven) {
        this.timeGiven = timeGiven;
    }

    public Integer getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(Integer timeSpent) {
        this.timeSpent = timeSpent;
    }
}
