package com.example.Book_My_Show.Entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int price;
    private String movieName;
    private String theatreName;

    private LocalTime showTime;
    private LocalDate showDate;
    @OneToMany
    private List<ShowSeat> bookedSeats;
    @JoinColumn
    @ManyToOne
    private User user;
}
