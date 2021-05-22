package com.sliit.mtit.microservice.inventoryservice.controller;

import com.sliit.mtit.microservice.inventoryservice.dto.InventoryRequest;
import com.sliit.mtit.microservice.inventoryservice.dto.InventoryResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody
    InventoryResponse addItem(@RequestBody InventoryRequest request){

        System.out.println("Item Details : " +request);

        var inventoryResponse = new InventoryResponse();
        inventoryResponse.setItemId(UUID.randomUUID().toString());
        inventoryResponse.setMsg("Successfully Added Items!");
        return inventoryResponse;

    }

}
