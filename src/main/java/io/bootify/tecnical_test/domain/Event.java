package io.bootify.tecnical_test.domain;

import lombok.Data;

import java.util.Set;

@Data
public class Event {

    private Integer available;
    private String collectionURI;
    private Integer returned;
    private Set<Item> items;

}
