package model;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.time.LocalDate;

@Entity                             //adnotacja tworzaca tabelke user w DB
//@Table(name = "uzytkownicy")          // ustawienie włąsnej nazwy dal tabelki sQl
public class User {
    @Id                                             //adnotacja determinujaca PK
    @GeneratedValue(strategy = GenerationType.AUTO) //adnotacja determinujaca AI

    private  int id_u;
//    @Column(name = "mejl")
    @Column(unique = true)

    private String email;
    @NotNull
    private  String password;
    @Enumerated
    private  RoleEnum role;                           // umozliwia przypisanie nazw rol zgodnie z role enum
    private boolean enable;
    private LocalDate date_added = LocalDate.now();
    @Transient                                  //adnotacja wylaczajaca pole przy mapowaniu
    private String secrete_code;



    public User() {
    }

    public User(String email, String password, RoleEnum role, boolean enable, LocalDate date_added, String secrete_code) {
        this.email = email;
        this.password = password;
        this.role = role;
        this.enable = enable;
        this.date_added = date_added;
        this.secrete_code = secrete_code;
    }

    public int getId_u() {
        return id_u;
    }

    public void setId_u(int id_u) {
        this.id_u = id_u;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public LocalDate getDate_added() {
        return date_added;
    }

    public void setDate_added(LocalDate date_added) {
        this.date_added = date_added;
    }

    public String getSecrete_code() {
        return secrete_code;
    }

    public void setSecrete_code(String secrete_code) {
        this.secrete_code = secrete_code;
    }
}

