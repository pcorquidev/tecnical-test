package io.bootify.tecnical_test.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "MarvelServicesQuery")
@Data
public class MarvelServiceQuery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String service;
    private LocalDateTime date;
}
