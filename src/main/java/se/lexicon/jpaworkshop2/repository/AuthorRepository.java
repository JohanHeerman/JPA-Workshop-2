package se.lexicon.jpaworkshop2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.jpaworkshop2.models.Author;

import java.util.List;
@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {
    List<Author> findAllByFirstName(String firstName);
    List<Author> findAllByLastName(String lastName);
    List<Author> findByBookId_BookId(int bookId);
    List<Author> findByKeyword(String keyword);
    List<Author> updateAuthorById(int id, String firstName, String lastName);
    List<Author> deleteAuthorById(int id);
}
