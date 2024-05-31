package io.bootify.tecnical_test.domain;

import java.util.List;

@lombok.Data
public class Data {
    private int offset;
    private int limit;
    private int total;
    private int count;
    private List<Result> results;
}
