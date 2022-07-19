package com.stackroute.oops;

/*
    Product class stores the information about a single product.
    It contains parameterized constructor and Getters/Setters
 */
public class Product {
	 private int prdCode;
	 private String prdName;
	 private double prdPrice;
	 private String prdCategory;

    public Product(int productCode, String name, double price, String category) {
        prdCode = productCode;
        prdName = name;
        prdPrice = price;
        prdCategory = category;
    }

    public int getProductCode() {
        return prdCode;
    }

    public void setProductCode(int productCode) {
    	prdCode = productCode;

    }

    public String getName() {
        return prdName;
    }

    public void setName(String name) {
    	prdName = name;
    }

    public double getPrice() {
        return prdPrice;
    }

    public void setPrice(double price) {
    	prdPrice = price;
    }

    public String getCategory() {
        return prdCategory;
    }

    public void setCategory(String category) {
    	prdCategory = category;

    }
}