package com.feedingfrenzy.feedme.dto;

import java.time.LocalDate;

/**
 * @author Wessel van Dommelen <w.r.van.dommelen@st.hanze.nl>
 */
public class ExcrementDTO {

    private LocalDate date;
    private boolean poo;
    private boolean pee;
    private String notes;

    public ExcrementDTO(LocalDate date, boolean poo, boolean pee, String notes) {
        this.date = date;
        this.poo = poo;
        this.pee = pee;
        this.notes = notes;
    }

    public ExcrementDTO() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isPoo() {
        return poo;
    }

    public void setPoo(boolean poo) {
        this.poo = poo;
    }

    public boolean isPee() {
        return pee;
    }

    public void setPee(boolean pee) {
        this.pee = pee;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
