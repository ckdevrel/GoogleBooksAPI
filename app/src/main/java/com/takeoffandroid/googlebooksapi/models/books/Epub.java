package com.takeoffandroid.googlebooksapi.models.books;

import org.json.*;


public class Epub {
	
    private boolean isAvailable;
    private String acsTokenLink;
    
    
	public Epub () {
		
	}	
        
    public Epub (JSONObject json) {
    
        this.isAvailable = json.optBoolean("isAvailable");
        this.acsTokenLink = json.optString("acsTokenLink");

    }
    
    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getAcsTokenLink() {
        return this.acsTokenLink;
    }

    public void setAcsTokenLink(String acsTokenLink) {
        this.acsTokenLink = acsTokenLink;
    }


    
}
