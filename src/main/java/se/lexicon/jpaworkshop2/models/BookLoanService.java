package se.lexicon.jpaworkshop2.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.lexicon.jpaworkshop2.repository.BookLoanRepository;

import java.time.LocalDate;

@Service
public class BookLoanService {

    //@Autowired
    //private BookLoanRepository bookLoanRepository;

    //public void markAsReturned(int id){
    // BookLoan bookLoan = bookLoanRepository.findById(id);
    // bookLoan.setReturned(true);
    // bookLoanRepository.save(bookLoan);

    @Autowired
    private BookLoanRepository bookLoanRepository;

    public void markAsReturned(Long loanId) {
        String returnDate = LocalDate.now().toString();
        int updatedRows = bookLoanRepository.markAsReturned(loanId, returnDate);

        if (updatedRows == 0) {
            System.out.println("Book loan with id: " + loanId + " has been returned");
        }
    }

}

