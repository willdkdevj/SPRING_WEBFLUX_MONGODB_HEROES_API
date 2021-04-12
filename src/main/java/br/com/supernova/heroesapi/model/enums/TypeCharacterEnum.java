package br.com.supernova.heroesapi.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TypeCharacterEnum {
    INDIVIDUAL("Individual"),
    PLACE("Place"),
    TEAM("Team");

    private final String type;
}
