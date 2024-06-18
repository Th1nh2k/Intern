package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name="quyen_menu")
public class Quyen_Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id  ;
    private boolean choPhep;

    @ManyToOne
    @JoinColumn(name="quyenid")
    private Quyen quyen;

    @ManyToOne
    @JoinColumn(name="menuid")
    private Menu menu;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public boolean isChoPhep(){
        return choPhep;
    }
    public void setChoPhep(boolean choPhep){
        this.choPhep = choPhep;
    }

}
