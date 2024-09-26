package se.lexicon.jpaworkshop2.models;

import jakarta.persistence.*;
import lombok.*;
import org.apache.catalina.User;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Entity
public class AppUser {
    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long id;

    @Setter
    @Column(nullable = false, length = 100, unique = true)
    private String username;
    @Setter
    @Column(nullable = false, length = 100)
    private String password;

    @Column
    private LocalDate regDate;

    @OneToOne
    @JoinColumn(name = "details_id")
    private Details details;

    @OneToMany(mappedBy = "appUser", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BookLoan> bookLoans;


}
