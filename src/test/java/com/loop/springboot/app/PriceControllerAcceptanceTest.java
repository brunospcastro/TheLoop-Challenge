package com.loop.springboot.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PriceControllerAcceptanceTest {

    @LocalServerPort
    int serverPort = 8081;

    private RestTemplate restTemplate;
    private String url;

    @BeforeEach
    void setUp() {
        restTemplate = new RestTemplate();
        url = "http://localhost:" + serverPort + "/api/price/getPrice";
    }


    //Teste 1: pedido às 10:00 do dia 14 para o produto 35455 para a marca 1 (LOJA).
    @Test
    void test1() throws Exception {
        ResponseEntity responseEntity = restTemplate.getForEntity(url + "?brand_id=1&product_id=35455&date=2020-06-14 10:00:00", List.class);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        List list = (List) responseEntity.getBody();
        int id = (int) ((HashMap) list.get(0)).get("id");
        assertEquals(1, id);
    }

    //Teste 2: pedido às 16:00 do dia 14 para o produto 35455 para a marca 1 (LOJA)
    @Test
    void test2() throws Exception {
        ResponseEntity responseEntity = restTemplate.getForEntity(url + "?brand_id=1&product_id=35455&date=2020-06-14 16:00:00", List.class);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        List list = (List) responseEntity.getBody();
        int id = (int) ((HashMap) list.get(0)).get("id");
        assertEquals(2, id);
    }
    
    //Teste 3: pedido às 21:00 do dia 14 para o produto 35455 para a marca 1 (LOJA)
    @Test
    void test3() throws Exception {
        ResponseEntity responseEntity = restTemplate.getForEntity(url + "?brand_id=1&product_id=35455&date=2020-06-14 21:00:00", List.class);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        List list = (List) responseEntity.getBody();
        int id = (int) ((HashMap) list.get(0)).get("id");
        assertEquals(1, id);
    }
    
    //Teste 4: pedido às 10:00 do dia 15 do produto 35455 para a marca 1 (LOJA)
    @Test
    void test4() throws Exception {
        ResponseEntity responseEntity = restTemplate.getForEntity(url + "?brand_id=1&product_id=35455&date=2020-06-15 10:00:00", List.class);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        List list = (List) responseEntity.getBody();
        int id = (int) ((HashMap) list.get(0)).get("id");
        assertEquals(3, id);
    }

    //Teste 5: pedido às 21:00 do dia 16 do produto 35455 para a marca 1 (LOJA)
    @Test
    void test5() throws Exception {
        ResponseEntity responseEntity = restTemplate.getForEntity(url + "?brand_id=1&product_id=35455&date=2020-06-16 21:00:00", List.class);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        List list = (List) responseEntity.getBody();
        int id = (int) ((HashMap) list.get(0)).get("id");
        assertEquals(4, id);
    }
    
}
