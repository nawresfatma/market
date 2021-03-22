package com.example.market;

public class ProductClass {
    private int prod;
    private String prodName,prodDescription,prodPrice,prodRemise;

    public ProductClass(int prod, String prodName, String prodDescription, String prodPrice,String prodRemise) {
        this.prod = prod;
        this.prodName = prodName;
        this.prodDescription = prodDescription;
        this.prodPrice = prodPrice;
        this.prodRemise=prodRemise;
    }

    public ProductClass(int prod, String prodName, String prodDescription, String prodPrice) {
        this.prod = prod;
        this.prodName = prodName;
        this.prodDescription = prodDescription;
        this.prodPrice = prodPrice;
    }

    public String getProdRemise() {
        return prodRemise;
    }

    public void setProdRemise(String prodRemise) {
        this.prodRemise = prodRemise;
    }

    public int getProd() {
        return prod;
    }

    public void setProd(int prod) {
        this.prod = prod;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdDescription() {
        return prodDescription;
    }

    public void setProdDescription(String prodDescription) {
        this.prodDescription = prodDescription;
    }

    public String getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(String prodPrice) {
        this.prodPrice = prodPrice;
    }
}
