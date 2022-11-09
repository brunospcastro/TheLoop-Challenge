package com.loop.springboot.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loop.springboot.app.model.Price;
import com.loop.springboot.app.service.PriceService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
public class PriceController {


    private final PriceService priceService;

    @Autowired
    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }

    /* 
    Price price = new Price(1, 0, 1, 1,"euro", "2020-06-14 00.00.00","2020-06-14 00.00.00");
    @RequestMapping(value = "/insert")
    public String insertPrice() {
        priceService.savePrice(price);
        return "Inserted";
    }
    */

}
