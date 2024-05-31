package io.bootify.tecnical_test.restClient;

import io.bootify.tecnical_test.config.MarvelClientConfig;
import io.bootify.tecnical_test.domain.MarvelResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@FeignClient(name = "marvelClient", url = "https://gateway.marvel.com:443/v1/public", configuration = MarvelClientConfig.class)
public interface MarvelClient {

    @GetMapping("/characters")
    MarvelResponse getCharacters();

    @GetMapping("/characters/{characterId}")
    MarvelResponse getCharacter(@PathVariable int characterId);

    @GetMapping("/characters")
    MarvelResponse getCharacters(
                @RequestParam(required = false) String name,
                @RequestParam(required = false) String nameStartWith,
                @RequestParam(required = false) LocalDate modifiedSince,
                @RequestParam(required = false) String comics,
                @RequestParam(required = false) String series,
                @RequestParam(required = false) String events,
                @RequestParam(required = false) String stories
    );
}