package com.grupo3.taller_tbd.repository;

import com.grupo3.taller_tbd.entities.Film;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FilmRepository extends PagingAndSortingRepository<Film, Integer> {
}
