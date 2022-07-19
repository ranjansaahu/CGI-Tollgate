package com.stackroute.oops;

import java.util.Arrays;

/*
    Class for Analyzing the products present in ProductRepository
 */
public class ProductService {
    private Product[] prod;
    private Product maxProd;
    private Product[] catProds;

    /*
        Returns the name of the product given the productCode
     */
    public String findProductNameByCode(int productCode) {
    	prod= ProductRepository.getProducts();
    	for(int i=0; i<prod.length; i++) {
    		if(prod[i].getProductCode()== productCode) {
    			return prod[i].getName();
    		}
    	}
        return null;
    }

    /*
        Returns the Product with maximum price in a given category
     */
    public Product findMaxPriceProductInCategory(String category) {
    	prod= ProductRepository.getProducts();
    	for(int i=0; i<prod.length; i++) {
    		if(prod[i].getCategory()== category) {
    			if(maxProd!= null) {
    				if(maxProd.getPrice()< prod[i].getPrice()) {
    					maxProd= prod[i];
    				}
    			}else {
    				maxProd= prod[i];
    			}
    		}
    	}
        return maxProd;
    }

    /*
        Returns a array of products for a given category
     */
    public Product[] getProductsByCategory(String category) {
    	prod = ProductRepository.getProducts();
        if (prod==null){
            System.out.println("NULL");
        }
        for(int i=0; i< prod.length; i++){
            if(prod[i].getCategory() == category){
                if(catProds!= null){
                    catProds = Arrays.copyOf(catProds, catProds.length+1);
                    catProds[catProds.length-1]= prod[i];
                }else{
                    catProds = new Product[1];
                    catProds[0]=prod[i];
                }

            }
        }
        return catProds;
    }
}
