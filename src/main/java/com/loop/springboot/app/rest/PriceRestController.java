package com.loop.springboot.app.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.loop.springboot.app.model.Price;
import com.loop.springboot.app.repository.PriceRepository;
import com.loop.springboot.app.service.PriceService;

@RestController
@RequestMapping(path = "/api/price")
public class PriceRestController {

    private final PriceService priceService;
    
    @Autowired
    public PriceRestController(PriceService priceService) {
        this.priceService = priceService;
    }

    @Autowired
    PriceRepository priceRepository;

    
    @GetMapping("/getPrice")
    public List<Price> getPrice(@RequestParam(name = "brand_id") int brand_id, @RequestParam(name = "product_id") int product_id, @RequestParam(name = "date") String date){
        return priceService.getPriceService(brand_id, product_id, date);
    }

}
