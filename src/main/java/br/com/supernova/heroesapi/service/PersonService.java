package br.com.supernova.heroesapi.service;

import br.com.supernova.heroesapi.model.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigInteger;

public interface PersonService {


    public Flux<Person> listAllPersons();

    public Mono<Person> findByPerson(BigInteger id);

    public Mono<Person> savedPerson(Person person);

    public void deleteByIDPerson(BigInteger id);
}
