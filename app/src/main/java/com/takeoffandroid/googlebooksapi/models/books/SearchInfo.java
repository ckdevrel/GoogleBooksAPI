package com.takeoffandroid.googlebooksapi.models.books;

import org.json.*;


public class SearchInfo {
	
    private String textSnippet;
    
    
	public SearchInfo () {
		
	}	
        
    public SearchInfo (JSONObject json) {
    
        this.textSnippet = json.optString("textSnippet");

    }
    
    public String getTextSnippet() {
        return this.textSnippet;
    }

    public void setTextSnippet(String textSnippet) {
        this.textSnippet = textSnippet;
    }


    
}
