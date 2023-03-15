package com.example.Book_My_Show.Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String mobileNo;
    private String address;
    private int age;

    @OneToMany(mappedBy = "user")
    private List<Ticket> bookedTickets=new ArrayList<>();
}
