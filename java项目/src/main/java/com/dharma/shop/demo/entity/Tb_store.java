package com.dharma.shop.demo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tb_store")
public class Tb_store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String address;
    @Column
    private String name;
    @Column
    private int tel;
   @OneToMany(cascade =CascadeType.ALL,mappedBy = "store")
    private Set<Dm_shop> shops=new HashSet<>();

    public Tb_store() {
    }

    public Tb_store(String address, String name, int tel, List<Dm_shop> shops) {
        this.address = address;
        this.name = name;
        this.tel = tel;
        this.shops = (Set<Dm_shop>) shops;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public List<Dm_shop> getShops() {
        return (List<Dm_shop>) shops;
    }

    public void setShops(List<Dm_shop> shops) {
        this.shops = (Set<Dm_shop>) shops;
    }
}
