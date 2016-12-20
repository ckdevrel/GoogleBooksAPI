package com.takeoffandroid.googlebooksapi.models.books;

import org.json.*;


public class IndustryIdentifiers {
	
    private String type;
    private String identifier;
    
    
	public IndustryIdentifiers () {
		
	}	
        
    public IndustryIdentifiers (JSONObject json) {
    
        this.type = json.optString("type");
        this.identifier = json.optString("identifier");

    }
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }


    
}
