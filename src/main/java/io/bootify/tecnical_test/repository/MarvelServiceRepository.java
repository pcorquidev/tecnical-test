package io.bootify.tecnical_test.repository;

import io.bootify.tecnical_test.domain.MarvelServiceQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarvelServiceRepository extends JpaRepository<MarvelServiceQuery,Long> {
}
