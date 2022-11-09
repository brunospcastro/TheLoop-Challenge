package com.loop.springboot.app.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.loop.springboot.app.model.Price;


/*
@Repository stereotype annotation is used to add a bean of this class
type to the Spring context and indicate that given Bean is used to perform
DB related operations and
* */
@Repository
public class PriceRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PriceRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int insertPrice(Price price){
        String sql = "INSERT INTO Price (id, brand_id, product_id, price, curr, start_date, end_date) VALUES (?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,price.getId(),price.getBrand_id(),price.getProduct_id(),price.getPrice(),
                                price.getCurr(),price.getStart_date(), price.getEnd_date());
    }


}
