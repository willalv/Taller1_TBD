package com.grupo3.taller_tbd.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
@NamedQuery(name="Actor.findAll", query="SELECT a FROM Actor a")
public class Actor implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="actor_id", unique=true, nullable=false)
    private int actorId;

    @Column(name="first_name", nullable=false, length=45)
    private String firstName;

    @Column(name="last_name", nullable=false, length=45)
    private String lastName;

    @Column(name="last_update", nullable=false)
    private Timestamp lastUpdate;


    @ManyToMany(cascade = {CascadeType.ALL})
    @JsonIgnore
    @JoinTable(name="film_actor",
            joinColumns={@JoinColumn(name="actor_id")},
            inverseJoinColumns={@JoinColumn(name="film_id")})
    private Set<Film> films =new HashSet<Film>();

    public Set<Film> getFilms() {
        return films;
    }

    public Actor() {
    }

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
