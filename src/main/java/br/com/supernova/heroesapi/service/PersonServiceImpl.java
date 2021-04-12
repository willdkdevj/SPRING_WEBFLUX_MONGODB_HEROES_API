package br.com.supernova.heroesapi.service;

import br.com.supernova.heroesapi.model.Person;
import br.com.supernova.heroesapi.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigInteger;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository repository;

    public Flux<Person> listAllPersons(){
        return (Flux<Person>) repository.findAll();
    }

    public Mono<Person> findByPerson(BigInteger id){

        return repository.findById(id);
    }

    public Mono<Person> savedPerson(Person person){
       return repository.save(person);
    }

    public void deleteByIDPerson(BigInteger id){
        repository.deleteById(id);
    }

    private Person checkIfIDExists(String id){
        return null;
    }

    private Person checkIfAlreadyRegisteredName(String name){
        return null;
    }
}
