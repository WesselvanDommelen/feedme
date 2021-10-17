package com.feedingfrenzy.feedme.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * @author Wessel van Dommelen <w.r.van.dommelen@st.hanze.nl>
 */

@Entity
public class Feeding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer feedingId;

    private Integer urlId;

    private boolean breastMilk;

    private LocalDateTime timeGiven;

    private Integer timeSpent;

    public Feeding(Integer urlId, boolean breastMilk, LocalDateTime timeGiven, Integer timeSpent) {
        this.urlId = urlId;
        this.breastMilk = breastMilk;
        this.timeGiven = timeGiven;
        this.timeSpent = timeSpent;
    }

    public Feeding() {
    }

    public Integer getFeedingId() {
        return feedingId;
    }

    public void setFeedingId(Integer feedingId) {
        this.feedingId = feedingId;
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
