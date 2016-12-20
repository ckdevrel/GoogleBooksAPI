package com.takeoffandroid.googlebooksapi.models.books;

import org.json.*;


public class ListPrice {
	
    private double amount;
    private String currencyCode;
    private double amountInMicros;
    
    
	public ListPrice () {
		
	}	
        
    public ListPrice (JSONObject json) {
    
        this.amount = json.optDouble("amount");
        this.currencyCode = json.optString("currencyCode");
        this.amountInMicros = json.optDouble("amountInMicros");

    }
    
    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public double getAmountInMicros() {
        return this.amountInMicros;
    }

    public void setAmountInMicros(double amountInMicros) {
        this.amountInMicros = amountInMicros;
    }


    
}
