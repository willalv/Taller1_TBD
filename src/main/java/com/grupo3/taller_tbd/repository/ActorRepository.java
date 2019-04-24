package com.grupo3.taller_tbd.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.grupo3.taller_tbd.entities.Actor;

public interface ActorRepository extends PagingAndSortingRepository<Actor, Integer> {
}
