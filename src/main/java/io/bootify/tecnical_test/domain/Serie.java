package io.bootify.tecnical_test.domain;

import lombok.Data;

import java.util.List;

@Data
public class Serie {

    private Integer available;
    private String collectionURI;
    List<Item> items;
    private Integer returned;

}
