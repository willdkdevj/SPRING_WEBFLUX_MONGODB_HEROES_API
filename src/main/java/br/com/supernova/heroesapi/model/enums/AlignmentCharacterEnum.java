package br.com.supernova.heroesapi.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AlignmentCharacterEnum {
    HERO("Hero"),
    VILLAIN("Villain");

    private final String alignment;
}
