package com.loop.springboot.app.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.loop.springboot.app.model.Price;
import com.loop.springboot.app.repository.PriceRepository;

@RestController
@RequestMapping(path = "/api/price")
public class PriceRestController {

    @Autowired
    PriceRepository priceRepository;

    //test
    @GetMapping("/getInfo")
    public Price getInfo(@RequestParam(name = "price") float price){
        return priceRepository.findByPrice(price);
    }

    @GetMapping("/getPrice")
    public List<Price> getPrice(@RequestParam(name = "brand_id") int brand_id, @RequestParam(name = "product_id") int product_id, @RequestParam(name = "date") String date){
        List<Price> list = priceRepository.findByParams(brand_id, product_id, date);
        int max = 0;
        for (Price price : list) {
            if (price.getPriority() >= max) max = price.getPriority();
        }
        for (Price price : list) {
            if (price.getPriority() != max) list.remove(price);
        }
        return list;
    }

}
