package com.example.demo.Model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name="nhomquyen")
public class NhomQuyen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="tennhomquyen")
    private String tenNhomQuyen;
    @Column(name="defaultpage")
    private String defaultPage;

//    @OneToMany(mappedBy="nhomQuyen", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Set<User> user;
//
//    @OneToMany(mappedBy="nhomQuyen", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Set<Quyen_NhomQuyen> quyenNhomQuyen;

    // Getters and setters

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTenNhomQuyen() {
        return tenNhomQuyen;
    }
    public void setTenNhomQuyen(String tenNhomQuyen) {
        this.tenNhomQuyen = tenNhomQuyen;
    }
    public String getDefaultPage() {
        return defaultPage;
    }
    public void setDefaultPage(String defaultPage) {
        this.defaultPage = defaultPage;
    }
//    public Set<User> getUser() {
//        return user;
//    }
//    public void setUser(Set<User> user) {
//        this.user = user;
//    }
//    public Set<Quyen_NhomQuyen> getQuyenNhomQuyen() {
//        return quyenNhomQuyen;
//    }
//    public void setQuyenNhomQuyen(Set<Quyen_NhomQuyen> quyenNhomQuyen) {
//        this.quyenNhomQuyen = quyenNhomQuyen;
//    }
}
