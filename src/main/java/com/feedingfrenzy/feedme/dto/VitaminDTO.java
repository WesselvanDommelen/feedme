package com.feedingfrenzy.feedme.dto;

import java.time.LocalDate;

/**
 * @author Wessel van Dommelen <w.r.van.dommelen@st.hanze.nl>
 */
public class VitaminDTO {

    private boolean given;
    private LocalDate dateGiven;

    public VitaminDTO(boolean given, LocalDate dateGiven) {
        this.given = given;
        this.dateGiven = dateGiven;
    }

    public VitaminDTO() {
    }

    public boolean isGiven() {
        return given;
    }

    public void setGiven(boolean given) {
        this.given = given;
    }

    public LocalDate getDateGiven() {
        return dateGiven;
    }

    public void setDateGiven(LocalDate dateGiven) {
        this.dateGiven = dateGiven;
    }
}
