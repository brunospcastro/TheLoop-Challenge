package com.loop.springboot.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;


import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Data
@AllArgsConstructor
@Table(name="Price")
public class Price{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    @Column(name="id")
    private int id;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL, targetEntity = Brand.class)
    @JoinColumn(name = "brand_id", referencedColumnName = "id",nullable = true)
    private int brand_id;

    @Column(name="product_id")
    private int product_id;

    @Column(name="price")
    private float price;

    @Column(name="curr")
    private String curr;

    @Column(name="start_date")
    private String start_date;

    @Column(name="end_date")
    private String end_date;
}

