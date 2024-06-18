package com.example.demo.Model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="quyen")
public class Quyen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String note;

    @OneToMany(mappedBy="quyen",fetch =FetchType.LAZY)
    private Set<Quyen_NhomQuyen> quyenNhomQuyen;

    @OneToMany(mappedBy="quyen",fetch =FetchType.LAZY)
    private Set<Quyen_Menu> quyenMenu;

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getNote(){
        return note;
    }
    public void setNote(String note){
        this.note = note;
    }
}
