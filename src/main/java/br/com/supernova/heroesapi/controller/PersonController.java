package br.com.supernova.heroesapi.controller;

import br.com.supernova.heroesapi.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigInteger;

public interface PersonController {
    public Flux<Person> findPersons();
    public Mono<Person> findByPerson(@PathVariable BigInteger id);
    public Mono<Person> savedPerson(@RequestBody Person person);
    public Mono<HttpStatus> deleteByIDPerson(@PathVariable BigInteger id);
}
