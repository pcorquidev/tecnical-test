package io.bootify.tecnical_test.rest;

import io.bootify.tecnical_test.domain.MarvelQuery;
import io.bootify.tecnical_test.service.BitacoraService;
import io.bootify.tecnical_test.service.MarvelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/bitacora", produces = MediaType.APPLICATION_JSON_VALUE)
public class BitacoraResource {

    @Autowired
    BitacoraService bitacoraService;

    @GetMapping
    public ResponseEntity<List<MarvelQuery>> getAll(){
        return new ResponseEntity<>(bitacoraService.getAll(), HttpStatus.OK);
    }
}
