package com.loop.springboot.app.model;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import lombok.Data;

@Entity
@Data
@Table(name="Tax")
public class Tax {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    @Column(name="id")
    private int id;

    @Column(name="tax")
    private int tax;

}
