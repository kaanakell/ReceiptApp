package com.example.myapplication;


public class Ingredients {
    int id;
    String malzeme;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMalzeme() {
        return malzeme;
    }

    public void setMalzeme(String malzeme) {
        this.malzeme = malzeme;
    }

    public Ingredients() {
    }

    public Ingredients(String malzeme) {

        this.malzeme = malzeme;
    }
}
