package br.com.supernova.heroesapi.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UniverseCharacterEnum {
    MARVEL("Marvel"),
    DC_COMICS("DC Comics");

    private final String universe;
}
