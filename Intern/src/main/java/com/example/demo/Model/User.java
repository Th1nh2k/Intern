package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name="taikhoan")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String username;
    private String password;
    @Column(name = "canbold")
    private String CanBold;
    @Column(name ="giangvienid")
    private int giangVienId;
    @Column(name ="hocvienid")
    private int hocVienId;
    private String department;

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
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCanBold() {
        return CanBold;
    }
    public void setCanBold(String CanBold) {
        this.CanBold = CanBold;
    }
    public int getGiangVienId() {
        return giangVienId;
    }
    public void setGiangVienId(int giangVienId) {
        this.giangVienId = giangVienId;
    }
    public int getHocVienId() {
        return hocVienId;
    }
    public void setHocVienId(int hocVienId) {
        this.hocVienId = hocVienId;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public NhomQuyen getNhomQuyen() {
        return nhomQuyen;
    }
    public void setNhomQuyen(NhomQuyen nhomQuyen) {
        this.nhomQuyen = nhomQuyen;
    }

    @Override
    public String toString() {
        return id+username + password;
    }
}
