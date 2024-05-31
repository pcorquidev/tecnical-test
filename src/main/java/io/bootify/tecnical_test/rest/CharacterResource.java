package io.bootify.tecnical_test.rest;

import io.bootify.tecnical_test.domain.MarvelResponse;
import io.bootify.tecnical_test.service.MarvelService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;


@RestController
@RequestMapping(value = "/api/characters", produces = MediaType.APPLICATION_JSON_VALUE)
public class CharacterResource {

    private final MarvelService marvelService;

    public CharacterResource(MarvelService marvelService) {
        this.marvelService = marvelService;
    }

    @GetMapping
    public MarvelResponse characters(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String nameStartWith,
            @RequestParam(required = false) LocalDate modifiedSince,
            @RequestParam(required = false) String comics,
            @RequestParam(required = false) String series,
            @RequestParam(required = false) String events,
            @RequestParam(required = false) String stories
    ){
        return marvelService.getCharacters(name,
                nameStartWith,
                modifiedSince,
                comics,
                series,
                events,
                stories);
    }

    @GetMapping("/{character_id}")
    public MarvelResponse marvel(@PathVariable int character_id){
        return marvelService.getCharacter(character_id);
    }

}
