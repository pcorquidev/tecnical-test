package io.bootify.tecnical_test.repos;

import io.bootify.tecnical_test.domain.MarvelQuery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarvelRepository extends JpaRepository<MarvelQuery,Long> {
}
