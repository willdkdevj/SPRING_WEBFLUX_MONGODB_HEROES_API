package br.com.supernova.heroesapi.model;

import br.com.supernova.heroesapi.model.enums.AlignmentCharacterEnum;
import br.com.supernova.heroesapi.model.enums.TypeCharacterEnum;
import br.com.supernova.heroesapi.model.enums.UniverseCharacterEnum;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
@Document(collection = "persons")
public class Person {

    @Id
    private BigInteger id;

    private String name;

    @Enumerated(EnumType.STRING)
    private UniverseCharacterEnum universe;

    @Enumerated(EnumType.STRING)
    private AlignmentCharacterEnum alignment;

    @Enumerated(EnumType.STRING)
    private TypeCharacterEnum type;

    private Integer film;

    private String data;

    public Person(BigInteger id, String name, UniverseCharacterEnum universe, AlignmentCharacterEnum alignment, TypeCharacterEnum type, Integer film, String data) {
        this.id = id;
        this.name = name;
        this.universe = universe;
        this.alignment = alignment;
        this.type = type;
        this.film = film;
        this.data = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }
}
