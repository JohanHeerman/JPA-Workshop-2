package se.lexicon.jpaworkshop2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.jpaworkshop2.models.Details;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface DetailsRepository extends CrudRepository<Details, Integer> {
    Optional<Details> findByEmail(String email);

    Optional<Details> findByName(String name);

    Optional<Details> findByBirthDate(LocalDate birthDate);

    Optional<Details> findById(Long id);

}
