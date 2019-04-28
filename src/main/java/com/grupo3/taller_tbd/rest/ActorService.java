package com.grupo3.taller_tbd.rest;

import com.grupo3.taller_tbd.entities.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import com.grupo3.taller_tbd.entities.Actor;
import com.grupo3.taller_tbd.repository.ActorRepository;
import java.util.Set;
import java.sql.Timestamp;

@RestController
@RequestMapping("/actors")
public class ActorService {

    @Autowired
    private ActorRepository actorRepository;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Actor> getAllUsers(){
        return actorRepository.findAll();
    }

    // GET - Actor por actor_id
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Actor getActor(@PathVariable Integer id)
    {
        Integer actorId = id.intValue();
        return actorRepository.findActorByActorId(actorId);
    }

    // GET - Films (a los que pertenece) por actor_id
    @RequestMapping(value = "/{id}/films", method = RequestMethod.GET)
    @ResponseBody
    public Set<Film> findFilms(@PathVariable("id") Integer id) {
        return actorRepository.findActorByActorId(id).getFilms();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Actor create(@RequestBody Actor resource) {
        Timestamp time = new Timestamp(System.currentTimeMillis());
        resource.setLastUpdate(time);
        return actorRepository.save(resource);
    }
}
