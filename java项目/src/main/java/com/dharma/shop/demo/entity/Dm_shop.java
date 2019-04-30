package com.dharma.shop.demo.entity;

import org.apache.catalina.Store;

import javax.persistence.*;

@Entity
@Table(name = "dm_shop")
public class Dm_shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    @Column
    private String name;
    @Column
    private int price;
  @ManyToOne
  @JoinColumn(name = "store_id")
    private Tb_store store;

    public Dm_shop() {
    }

    public Dm_shop(String name, int price, Store store) {
        this.name = name;
        this.price = price;
        this.store = (Tb_store) store;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Store getStore() {
        return (Store) store;
    }

    public void setStore(Store store) {
        this.store = (Tb_store) store;
    }
}
