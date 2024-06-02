package io.bootify.tecnical_test.service;

import io.bootify.tecnical_test.domain.MarvelQuery;
import io.bootify.tecnical_test.repos.MarvelRepository;
import org.hibernate.validator.internal.IgnoreForbiddenApisErrors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BitacoraService {

    @Autowired
    MarvelRepository marvelRepository;

    public List<MarvelQuery> getAll(){
        return marvelRepository.findAll();
    }
}
