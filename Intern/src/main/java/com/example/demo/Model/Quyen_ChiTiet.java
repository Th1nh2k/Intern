package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name="quyen_chitiet")
public class Quyen_ChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean xem;
    private boolean them;
    private boolean xoa;
    private boolean sua;

    @ManyToOne
    @JoinColumn(name="quyenid")
    private Quyen quyen;


    @ManyToOne
    @JoinColumn(name="bangid")
    private DBTable dbTable;

    public long getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public boolean isXem(){
        return xem;
    }
    public void setXem(boolean xem){
        this.xem = xem;
    }
    public boolean isThem(){
        return them;
    }
    public void setThem(boolean them){
        this.them = them;
    }
    public boolean isXoa(){
        return xoa;
    }
    public void setXoa(boolean xoa){
        this.xoa = xoa;
    }
    public boolean isSua(){
        return sua;
    }

}
