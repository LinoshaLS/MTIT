package com.sliit.mtit.microservice.orderservice.dto;

public class InventoryCreationRequest {

    private String itemName;
    private String qty;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }
}
