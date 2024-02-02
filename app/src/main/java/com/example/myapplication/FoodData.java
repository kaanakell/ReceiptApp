package com.example.myapplication;

public class FoodData {


    private String itemName;
    private String itemDescription;
    private byte[] itemImage;
    private String itemIngredients;


    public FoodData() {
    }

    public FoodData(String itemName, String itemDescription, byte[] itemImage, String itemIngredients) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemImage = itemImage;
        this.itemIngredients = itemIngredients;

    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setItemImage(byte[] itemImage) {
        this.itemImage = itemImage;
    }

    public void setItemIngredients(String itemIngredients) {
        this.itemIngredients = itemIngredients;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public byte[] getItemImage() {
        return itemImage;
    }

    public String getItemIngredients() {
        return itemIngredients;
    }
}
