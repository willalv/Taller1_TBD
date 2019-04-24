package com.grupo3.taller_tbd.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.grupo3.taller_tbd.entities.Actor;
import com.grupo3.taller_tbd.repository.ActorRepository;

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

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Actor create(@RequestBody Actor resource) {

        return actorRepository.save(resource);
    }
}
