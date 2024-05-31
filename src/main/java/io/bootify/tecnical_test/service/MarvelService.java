package io.bootify.tecnical_test.service;

import io.bootify.tecnical_test.domain.MarvelQuery;
import io.bootify.tecnical_test.repos.MarvelRepository;
import io.bootify.tecnical_test.restClient.MarvelClient;
import io.bootify.tecnical_test.domain.MarvelResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class MarvelService {

    private final MarvelRepository marvelServiceRepository;
    private final MarvelClient marvelClient;

    public MarvelService(MarvelRepository marvelServiceRepository, MarvelClient marvelClient) {
        this.marvelServiceRepository = marvelServiceRepository;
        this.marvelClient = marvelClient;
    }

    public MarvelResponse getCharacter(int character_id){
        saveServiceDate("GET /v1/public/characters/" + character_id);
        return marvelClient.getCharacter(character_id);
    }

    public MarvelResponse getCharacters(String name,
                                        String nameStartWith,
                                        LocalDate modifiedSince,
                                        String comics,
                                        String series,
                                        String events,
                                        String stories) {
        saveServiceDate("GET /v1/public/characters");
        return marvelClient.getCharacters(name,
                nameStartWith,
                modifiedSince,
                comics,
                series,
                events,
                stories);
    }

    private void saveServiceDate(String character_id) {
        LocalDateTime date = LocalDateTime.now();
        MarvelQuery marvelServiceQuery = new MarvelQuery();
        marvelServiceQuery.setService(character_id);
        marvelServiceQuery.setDate(date);
        marvelServiceRepository.save(marvelServiceQuery);
    }
}
