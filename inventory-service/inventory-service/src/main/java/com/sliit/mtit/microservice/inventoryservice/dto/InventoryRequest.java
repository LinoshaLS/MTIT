package com.sliit.mtit.microservice.inventoryservice.dto;

public class InventoryRequest {

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

    @Override
    public String toString() {
        return "InventoryRequest{" +
                "itemName='" + itemName + '\'' +
                ", qty='" + qty + '\'' +
                '}';
    }
}
