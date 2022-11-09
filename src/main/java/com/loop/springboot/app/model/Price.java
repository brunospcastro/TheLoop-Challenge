package com.loop.springboot.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Data
@RequiredArgsConstructor
@Table(name="Price")
public class Price{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    @Column(name="id")
    private int id;

    @NonNull
    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL, targetEntity = Brand.class)
    @JoinColumn(name = "brand_id", referencedColumnName = "id",nullable = true)
    private int brand_id;

    @NonNull
    @Column(name="priority")
    private int priority;

    @NonNull
    @Column(name="product_id")
    private int product_id;

    @NonNull
    @Column(name="price")
    private float price;

    @NonNull
    @Column(name="curr")
    private String curr;

    @NonNull
    @Column(name="start_date")
    private String start_date;

    @NonNull
    @Column(name="end_date")
    private String end_date;
}

