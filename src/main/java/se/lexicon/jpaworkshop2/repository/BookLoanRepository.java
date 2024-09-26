package se.lexicon.jpaworkshop2.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.jpaworkshop2.models.BookLoan;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface BookLoanRepository extends CrudRepository<BookLoan, Integer> {
    List<BookLoan> findByBookId_BookId(Long BookId);
    List<BookLoan> findByBorrower_BorrowerId(Long BorrowerId);
    List<BookLoan> findByDueDate(LocalDate dueDate);
    List<BookLoan> findByReturned(boolean returned);
    List<BookLoan> findByLoanDate(LocalDate loanDate);


    @Modifying
    @Query("UPDATE BookLoan bl SET bl.returnDate = :returnDate WHERE bl.id = :loanId")
    int markAsReturned(Long loanId, String returnDate);







   // BookLoan findById(int id);



}
