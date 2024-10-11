package com.example.clase7gtics.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "funciones")
public class Funciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "funcionesid")
    private int id;
    @Column(name = "obraId", nullable = false)
    private String obraId;

    @Column(name = "roomId", nullable = false)
    private String roomId;
    private Date funcionDate;
    private int availableSeats;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getObraId() {
        return obraId;
    }

    public void setObraId(String obraId) {
        this.obraId = obraId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public Date getFuncionDate() {
        return funcionDate;
    }

    public void setFuncionDate(Date funcionDate) {
        this.funcionDate = funcionDate;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
}
