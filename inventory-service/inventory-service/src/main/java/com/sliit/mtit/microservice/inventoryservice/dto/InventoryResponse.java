package com.sliit.mtit.microservice.inventoryservice.dto;

public class InventoryResponse {

    private String itemId;
    private String msg;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
