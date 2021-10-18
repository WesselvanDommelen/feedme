package com.feedingfrenzy.feedme.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author Wessel van Dommelen <w.r.van.dommelen@st.hanze.nl>
 */

public class FeedingDTO {

    private Integer urlId;
    private boolean breastMilk;
    private LocalTime timeGiven;
    private LocalDate dateGiven;
    private Integer timeSpent;
    private String breast;

    public FeedingDTO(Integer urlId, boolean breastMilk, LocalTime timeGiven, LocalDate dateGiven, Integer timeSpent, String breast) {
        this.urlId = urlId;
        this.breastMilk = breastMilk;
        this.timeGiven = timeGiven;
        this.dateGiven = dateGiven;
        this.timeSpent = timeSpent;
        this.breast = breast;
    }

    public FeedingDTO(boolean breastMilk, LocalTime timeGiven, LocalDate dateGiven, Integer timeSpent, String breast) {
        this.breastMilk = breastMilk;
        this.timeGiven = timeGiven;
        this.dateGiven = dateGiven;
        this.timeSpent = timeSpent;
        this.breast = breast;
    }

    public FeedingDTO() {
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

    public LocalTime getTimeGiven() {
        return timeGiven;
    }

    public void setTimeGiven(LocalTime timeGiven) {
        this.timeGiven = timeGiven;
    }

    public LocalDate getDateGiven() {
        return dateGiven;
    }

    public void setDateGiven(LocalDate dateGiven) {
        this.dateGiven = dateGiven;
    }

    public Integer getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(Integer timeSpent) {
        this.timeSpent = timeSpent;
    }

    public String getBreast() {
        return breast;
    }

    public void setBreast(String breast) {
        this.breast = breast;
    }
}
