package com.example.Book_My_Show.Entity;

import com.example.Book_My_Show.Enum.SeatType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "show_seats")
public class ShowSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int price;
    private SeatType seatType;
//    private Date bookedAt;
    private boolean isBooked;
}
