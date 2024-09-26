package se.lexicon.jpaworkshop2.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.jpaworkshop2.models.Book;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
    List<Book> findByBookId(Long bookId);

    List<Book> findByIsbn(String isbn);

    List<Book> findByTitle(String title);

    List<Book> findByMaxLoanDays(int maxLoanDays);

    @Query("SELECT b FROM Book b WHERE b.maxLoanDays < :maxLoanDays")
    List<Book> findByMaxLoanDaysLessThan(int maxLoanDays);
}
