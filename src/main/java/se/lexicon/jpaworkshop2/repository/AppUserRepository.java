package se.lexicon.jpaworkshop2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.jpaworkshop2.models.AppUser;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Integer> {

        AppUser findByUsername(String username);
        AppUser findByDetailsEmail(String email);
        AppUser findByDetailsName(String name);
        List<AppUser> findByRegDate(LocalDate regDate);


}
