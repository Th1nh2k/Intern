package com.example.demo.Model;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "menu")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable=true)
    private String url;
    private String name;
    @Column(nullable=true,name="menucha")
    private int menuCha;
    @Column(nullable=true)
    private String hinh;

    @Column(nullable=true)
    private String nhom;
    @Column(nullable=true,name="stt")
    private int STT;

    @OneToMany(mappedBy = "menu",fetch =FetchType.LAZY)
    private Set<Quyen_Menu> quyenMenu;

    @ManyToOne
    @JoinColumn(name ="menuid")
    private Menu superMenu;

//    @OneToMany(mappedBy="superMenu",fetch =FetchType.LAZY)
//    private List<Menu> subMenus;


    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public String getUrl(){
        return url;
    }
    public void setUrl(String url){
        this.url = url;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getMenuCha(){
        return menuCha;
    }
    public void setMenuCha(int menuCha){
        this.menuCha = menuCha;
    }
    public String getHinh(){
        return hinh;
    }
    public void setHinh(String hinh){
        this.hinh = hinh;
    }
//    public String getMenuId(){
//        return menuId;
//    }
//    public void setMenuId(String menuId){
//        this.menuId = menuId;
//    }
    public String getNhom(){
        return nhom;
    }
    public void setNhom(String nhom){
        this.nhom = nhom;
    }
    public int getSTT(){
        return STT;
    }
    public void setSTT(int STT){
        this.STT = STT;
    }

}
