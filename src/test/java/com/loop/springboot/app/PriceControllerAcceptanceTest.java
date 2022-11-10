package com.loop.springboot.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.loop.springboot.app.model.Price;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PriceControllerAcceptanceTest {

    @LocalServerPort
    int randomServerPort = 8081;

    private RestTemplate restTemplate;
    private String url;

    @BeforeEach
    void setUp() {
        restTemplate = new RestTemplate();
        url = "http://localhost:" + randomServerPort + "/api/price/getPrice";
    }

    @Test
    void shouldGetCustomWelcomeMessage() throws Exception {
        ResponseEntity responseEntity = restTemplate.getForEntity(url + "?brand_id=1&product_id=35455&date=2020-06-14 00:00:00", List.class);
        //assertEquals(OK, responseEntity.getStatusCode());
        List list = (List) responseEntity.getBody();
        int id = (int) ((HashMap) list.get(0)).get("id");
        assertEquals(1, id);
    }
    
}
