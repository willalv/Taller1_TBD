package com.grupo3.taller_tbd.rest;

import com.grupo3.taller_tbd.entities.Film;
import com.grupo3.taller_tbd.repository.ActorRepository;
import com.grupo3.taller_tbd.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
@CrossOrigin(origins = "http://localhost:8082")
@RestController
@RequestMapping("/films")
public class FilmService {

    @Autowired
    private FilmRepository filmRepository;
    @Autowired
    private ActorRepository actorRepository;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Film getFilm(@PathVariable Integer id)
    {
        Integer filmId = id.intValue();
        return filmRepository.findFilmById(filmId);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Film create(@RequestBody Film resource) {
        Timestamp time = new Timestamp(System.currentTimeMillis());
        resource.setLastUpdate(time);
        return filmRepository.save(resource);
    }
}
