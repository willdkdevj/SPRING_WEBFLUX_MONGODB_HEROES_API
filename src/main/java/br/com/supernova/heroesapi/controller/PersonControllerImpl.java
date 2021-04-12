package br.com.supernova.heroesapi.controller;

import br.com.supernova.heroesapi.model.Person;
import br.com.supernova.heroesapi.service.PersonService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigInteger;

@Slf4j
@RestController
@RequestMapping("/api/v1/characters")
@RequiredArgsConstructor
public class PersonControllerImpl implements PersonController{

    private static final Logger log = LoggerFactory.getLogger(PersonControllerImpl.class);

    private final PersonService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Flux<Person> findPersons(){
        log.info("Requesting the list off all heroes");
        return service.listAllPersons();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Person> findByPerson(@PathVariable BigInteger id){
        log.info("Requesting the hero by ID - {}", id);
        return service.findByPerson(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Person> savedPerson(@RequestBody Person person){
        log.info("A new Hero was Created");
        Mono<Person> saved = service.savedPerson(person);
        return saved;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<HttpStatus> deleteByIDPerson(@PathVariable BigInteger id){
        service.deleteByIDPerson(id);
        log.info("Deleting the hero with id {}", id);
        return Mono.just(HttpStatus.OK);
    }
}
