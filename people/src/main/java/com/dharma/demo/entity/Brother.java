package com.dharma.demo.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "brother")
public class Brother {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private Double grade;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "brother")
    private Set<Roomate>brothers=new HashSet<>();

    public Brother() {
    }

    public Brother(String name, Double grade, Set<Roomate> brothers) {
        this.name = name;
        this.grade = grade;
        this.brothers = brothers;
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

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public Set<Roomate> getRoomates() {
        return brothers;
    }

    public void setRoomates(Set<Roomate> brothers) {
        this.brothers = brothers;
    }
}
