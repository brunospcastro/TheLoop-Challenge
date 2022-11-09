package com.loop.springboot.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.loop.springboot.app.model.Price;

@Repository
public interface PriceRepository2 extends CrudRepository<Price, Integer> {

    Price findByPrice(float id);

    @Query(value="SELECT * FROM Price p WHERE p.brand_id = :brand_id and p.product_id = :product_id and :date between p.start_date and p.end_date", nativeQuery = true)
    List<Price> findByParams(int brand_id, int product_id, String date);

    //SELECT * FROM PRICE where '2020-06-14 02:00:00' between start_date and end_date and brand_id = 1 and product_id = 35455
    
}
