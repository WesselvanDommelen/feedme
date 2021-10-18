package com.feedingfrenzy.feedme.model;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Wessel van Dommelen <w.r.van.dommelen@st.hanze.nl>
 */

@Entity
public class Vitamin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer vitaminId;

    private boolean given;

    @Column(unique = true)
    private LocalDate dateGiven;

    public Vitamin(boolean given, LocalDate dateGiven) {
        this.given = given;
        this.dateGiven = dateGiven;
    }

    public Vitamin() {
    }

    public Integer getVitaminId() {
        return vitaminId;
    }

    public void setVitaminId(Integer vitaminId) {
        this.vitaminId = vitaminId;
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
