package io.bootify.tecnical_test.domain;

import lombok.Data;

import java.util.List;

@Data
public class Comic {

    private Integer available;
    private String collectionURI;
    private List<Item> items;
    private Integer returned;
}
