package com.loop.springboot.app.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loop.springboot.app.model.Price;
import com.loop.springboot.app.repository.PriceRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PriceService {

    @Autowired
    private PriceRepository priceRepository;

    /* 
    public boolean savePrice(Price price){
        boolean isSaved = false;
        int result = priceRepository.insertPrice(price);
        if(result>0) {
            isSaved = true;
        }
        return isSaved;
    }
    */
}
