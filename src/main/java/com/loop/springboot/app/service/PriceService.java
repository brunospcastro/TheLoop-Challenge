package com.loop.springboot.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.loop.springboot.app.model.Price;
import com.loop.springboot.app.repository.PriceRepository;

@Service
public class PriceService {

    @Autowired
    private PriceRepository priceRepository;

    public List<Price> getPriceService(int brand_id, int product_id, String date){
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
