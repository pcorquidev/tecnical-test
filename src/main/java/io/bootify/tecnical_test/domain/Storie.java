package io.bootify.tecnical_test.domain;

import java.time.OffsetDateTime;
import java.util.Set;

import lombok.Data;

@Data
public class Storie {

    private Integer available;
    private String collectionURI;
    private Integer returned;
    private Set<Item> items;
}
