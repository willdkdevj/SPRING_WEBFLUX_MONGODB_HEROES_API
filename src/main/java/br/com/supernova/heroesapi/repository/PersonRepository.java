package br.com.supernova.heroesapi.repository;

import br.com.supernova.heroesapi.model.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import java.math.BigInteger;


public interface PersonRepository extends ReactiveMongoRepository<Person, BigInteger> {

}
