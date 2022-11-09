package com.loop.springboot.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.loop.springboot.app.model.Price;
import com.loop.springboot.app.repository.PriceRepository;
import com.loop.springboot.app.repository.PriceRepository2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path = "/api/price")
public class PriceRestController {

    @Autowired
    PriceRepository2 priceRepository;

    @GetMapping("/getInfo")
    @ResponseBody
    public Price getPrice(@RequestParam(name = "price") float price){
        return priceRepository.findByPrice(price);
    }

    @GetMapping("/getPrice")
    @ResponseBody
    public List<Price> getPrice1(@RequestParam(name = "brand_id") int brand_id, @RequestParam(name = "product_id") int product_id, @RequestParam(name = "date") String date){
        return priceRepository.findByParams(brand_id, product_id, date);
    }

    
    
}
