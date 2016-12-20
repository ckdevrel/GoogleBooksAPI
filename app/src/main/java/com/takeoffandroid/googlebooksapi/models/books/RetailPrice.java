package com.takeoffandroid.googlebooksapi.models.books;

import org.json.*;


public class RetailPrice {
	
    private double amountInMicros;
    private String currencyCode;
    private double amount;
    
    
	public RetailPrice () {
		
	}	
        
    public RetailPrice (JSONObject json) {
    
        this.amountInMicros = json.optDouble("amountInMicros");
        this.currencyCode = json.optString("currencyCode");
        this.amount = json.optDouble("amount");

    }
    
    public double getAmountInMicros() {
        return this.amountInMicros;
    }

    public void setAmountInMicros(double amountInMicros) {
        this.amountInMicros = amountInMicros;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    
}
