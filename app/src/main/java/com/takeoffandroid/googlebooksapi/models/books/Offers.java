package com.takeoffandroid.googlebooksapi.models.books;

import org.json.*;


public class Offers {
	
    private double finskyOfferType;
    private RetailPrice retailPrice;
    private ListPrice listPrice;
    
    
	public Offers () {
		
	}	
        
    public Offers (JSONObject json) {
    
        this.finskyOfferType = json.optDouble("finskyOfferType");
        this.retailPrice = new RetailPrice(json.optJSONObject("retailPrice"));
        this.listPrice = new ListPrice(json.optJSONObject("listPrice"));

    }
    
    public double getFinskyOfferType() {
        return this.finskyOfferType;
    }

    public void setFinskyOfferType(double finskyOfferType) {
        this.finskyOfferType = finskyOfferType;
    }

    public RetailPrice getRetailPrice() {
        return this.retailPrice;
    }

    public void setRetailPrice(RetailPrice retailPrice) {
        this.retailPrice = retailPrice;
    }

    public ListPrice getListPrice() {
        return this.listPrice;
    }

    public void setListPrice(ListPrice listPrice) {
        this.listPrice = listPrice;
    }


    
}
