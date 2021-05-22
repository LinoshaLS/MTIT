package com.sliit.mtit.microservice.orderservice.service;

import com.sliit.mtit.microservice.orderservice.dto.InventoryCreationRequest;
import com.sliit.mtit.microservice.orderservice.dto.InventoryCreationResponse;
import com.sliit.mtit.microservice.orderservice.dto.OrderRequest;
import com.sliit.mtit.microservice.orderservice.dto.OrderResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class OrderServiceImplementation  {

    @Autowired
    private RestTemplate restTemplate;

    public OrderResponse createOrder(OrderRequest orderRequest){

        var inventoryCreationRequest = new InventoryCreationRequest();
        inventoryCreationRequest.setItemName(orderRequest.getItemName());
        inventoryCreationRequest.setQty(orderRequest.getQty());
        ResponseEntity <InventoryCreationResponse> inventoryCreationResponse = restTemplate.postForEntity("http://localhost:8080/inventory",inventoryCreationRequest, InventoryCreationResponse.class);

        var orderResponse = new OrderResponse();
        orderResponse.setOrderId(UUID.randomUUID().toString());
        orderResponse.setItemId(inventoryCreationResponse.getBody().getItemId());
        orderResponse.setMsg("Successfully Created an Order!");
        return orderResponse;

    }
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){

        return  builder.build();

    }

}
