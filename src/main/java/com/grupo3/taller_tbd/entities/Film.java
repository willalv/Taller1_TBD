package com.grupo3.taller_tbd.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
@Table
@NamedQuery(name="Film.findAll", query="SELECT f FROM Film f")
public class Film implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "film_id", unique = true, nullable = false)
    private Integer filmId;

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name= "description", nullable=true)
    private String description;

    @Column(name= "release_year", nullable=true)
    private Integer releaseYear;

    @Column(name = "language_id", nullable = false)
    private Integer languageId;

    @Column(name = "original_language_id")
    private Integer original_language_id;

    @Column(name= "rental_duration", nullable=false)
    private Integer rentalDuration;

    @Column(name= "rental_rate", nullable=false)
    private float rentalRate;

    @Column(name= "length", nullable=true)
    private Integer length;

    @Column(name= "replacement_cost", nullable=false)
    private float replacementCost;

    @Column(name= "rating", nullable=true)
    private String rating;

    @Column(name= "special_features", nullable=true)
    private String specialFeatures;

    @Column(name= "last_update", nullable=false)
    private Timestamp lastUpdate;

    public Film() {
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public Integer getOriginal_language_id() {
        return original_language_id;
    }

    public void setOriginal_language_id(Integer original_language_id) {
        this.original_language_id = original_language_id;
    }

    public Integer getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(Integer rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public float getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(float rentalRate) {
        this.rentalRate = rentalRate;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public float getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(float replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}
