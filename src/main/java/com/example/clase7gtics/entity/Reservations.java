package com.example.clase7gtics.entity;

import jakarta.persistence.*;

import java.time.DateTimeException;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity
@Table(name = "reservations")
public class Reservations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservationid")
    private int id;
    @Column(name = "userId", nullable = false)
    private int userId;
    @Column(name = "funcionrId", nullable = false)
    private int funcionId;
    @Column(name = "roomSeatId", nullable = false)
    private int roomSeatId;
    private Date startDateTime;

    private Date endDateTime;


}

