package io.bootify.tecnical_test.domain;

import lombok.Data;

import java.util.List;

@Data
public class Result {
    private int id;
    private String name;
    private String description;
    private String modified;
    private Thumbnail thumbnail;
    private String resourceURI;
    private Comic comics;
    private Serie series;
    private Storie stories;
    private Event events;
    private List<Url> urls;
}
