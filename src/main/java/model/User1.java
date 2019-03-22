package model;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.List;

@Entity                             //adnotacja tworzaca tabelke user w DB
//@Table(name = "uzytkownicy")          // ustawienie włąsnej nazwy dal tabelki sQl
public class User1 {
    @Id                                             //adnotacja determinujaca PK
    @GeneratedValue(strategy = GenerationType.AUTO) //adnotacja determinujaca AI

    private int id_u;
    //    @Column(name = "mejl")
    @Column(unique = true)

    private String email;
    @NotNull
    private String password;
    //CascadeType.All-> związane z odwołaniem do encji i jej relacji
    //FetchType.eager -> przy utworzeniu encji mamy dostep do powiazan
    //fetch.lazy -> przy utworzeniu encji musimy recznie wywołac powiazania

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
            @JoinTable(name = "user1_role1")
            Set<Role1> roles = new HashSet<>();


            // uzytkownik moze miec wiele rol

    private boolean enable;
    private LocalDate date_added = LocalDate.now();
    @Transient                                  //adnotacja wylaczajaca pole przy mapowaniu
    private String secrete_code;
//relacja 1:n
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL, mappedBy = "user")
    List<Post1> posts = new ArrayList<>();



    public User1() {
    }

}

