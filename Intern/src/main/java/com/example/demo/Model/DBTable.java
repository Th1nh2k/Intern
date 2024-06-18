package com.example.demo.Model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="dbtable")
public class DBTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String ten;
    private String tenTV;

    @OneToMany(mappedBy = "dbTable",fetch =FetchType.LAZY)
    private Set<Quyen_ChiTiet> quyenChiTiet;

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public String getTen(){
        return ten;
    }
    public void setTen(String ten){
        this.ten = ten;
    }
    public String getTenTV(){
        return tenTV;
    }
}
