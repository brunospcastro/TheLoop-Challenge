package com.loop.springboot.app.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.loop.springboot.app.model.Price;


@Repository
public class PriceRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PriceRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /* 
    public int insertPrice(Price price){
        String sql = "INSERT INTO Price (brand_id, priority, product_id, price, curr, start_date, end_date) VALUES (?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,price.getBrand_id(),price.getPriority(),price.getProduct_id(),price.getPrice(),
                                price.getCurr(),price.getStart_date(), price.getEnd_date());
    }
    */


}
