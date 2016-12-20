package com.takeoffandroid.googlebooksapi.models.books;

import org.json.*;
import java.util.ArrayList;

public class SaleInfo {
	
    private ListPrice listPrice;
    private ArrayList<Offers> offers;
    private String country;
    private String saleability;
    private RetailPrice retailPrice;
    private boolean isEbook;
    private String buyLink;
    
    
	public SaleInfo () {
		
	}	
        
    public SaleInfo (JSONObject json) {
    
        this.listPrice = new ListPrice(json.optJSONObject("listPrice"));

        this.offers = new ArrayList<Offers>();
        JSONArray arrayOffers = json.optJSONArray("offers");
        if (null != arrayOffers) {
            int offersLength = arrayOffers.length();
            for (int i = 0; i < offersLength; i++) {
                JSONObject item = arrayOffers.optJSONObject(i);
                if (null != item) {
                    this.offers.add(new Offers(item));
                }
            }
        }
        else {
            JSONObject item = json.optJSONObject("offers");
            if (null != item) {
                this.offers.add(new Offers(item));
            }
        }

        this.country = json.optString("country");
        this.saleability = json.optString("saleability");
        this.retailPrice = new RetailPrice(json.optJSONObject("retailPrice"));
        this.isEbook = json.optBoolean("isEbook");
        this.buyLink = json.optString("buyLink");

    }
    
    public ListPrice getListPrice() {
        return this.listPrice;
    }

    public void setListPrice(ListPrice listPrice) {
        this.listPrice = listPrice;
    }

    public ArrayList<Offers> getOffers() {
        return this.offers;
    }

    public void setOffers(ArrayList<Offers> offers) {
        this.offers = offers;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSaleability() {
        return this.saleability;
    }

    public void setSaleability(String saleability) {
        this.saleability = saleability;
    }

    public RetailPrice getRetailPrice() {
        return this.retailPrice;
    }

    public void setRetailPrice(RetailPrice retailPrice) {
        this.retailPrice = retailPrice;
    }

    public boolean getIsEbook() {
        return this.isEbook;
    }

    public void setIsEbook(boolean isEbook) {
        this.isEbook = isEbook;
    }

    public String getBuyLink() {
        return this.buyLink;
    }

    public void setBuyLink(String buyLink) {
        this.buyLink = buyLink;
    }


    
}
