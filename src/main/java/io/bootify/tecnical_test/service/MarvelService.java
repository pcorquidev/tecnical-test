package io.bootify.tecnical_test.service;

import io.bootify.tecnical_test.MarvelClient;
import io.bootify.tecnical_test.domain.MarvelResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class MarvelService {

    private final MarvelClient marvelClient;

    public MarvelService(MarvelClient marvelClient) {
        this.marvelClient = marvelClient;
    }

    public MarvelResponse getCharacter(int character_id){
        return marvelClient.getCharacter(character_id);
    }

    public MarvelResponse getCharacters(String name, String nameStartWith, LocalDate modifiedSince, String comics, String series, String events, String stories) {
        return marvelClient.getCharacters(name, nameStartWith,modifiedSince,comics,series,events,stories);
    }
}
