package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name="quyen_nhomquyen")

public class Quyen_NhomQuyen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name="maquyen")
    private Quyen quyen;

    @ManyToOne
    @JoinColumn(name="manhomquyen")
    private NhomQuyen nhomQuyen;

    // Getters and setters

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Quyen getQuyen() {
        return quyen;
    }
    public void setQuyen(Quyen quyen) {
        this.quyen = quyen;
    }
    public NhomQuyen getNhomQuyen() {
        return nhomQuyen;
    }
    public void setNhomQuyen(NhomQuyen nhomQuyen) {
        this.nhomQuyen = nhomQuyen;
    }
}
