package com.loop.springboot.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
@Table(name="Price")
public class Price{

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    @Column(name="id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @Column(name="priority")
    private int priority;

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

