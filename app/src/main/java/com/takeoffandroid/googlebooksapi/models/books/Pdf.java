package com.takeoffandroid.googlebooksapi.models.books;

import org.json.*;


public class Pdf {
	
    private boolean isAvailable;
    private String downloadLink;
    private String acsTokenLink;
    
    
	public Pdf () {
		
	}	
        
    public Pdf (JSONObject json) {
    
        this.isAvailable = json.optBoolean("isAvailable");
        this.downloadLink = json.optString("downloadLink");
        this.acsTokenLink = json.optString("acsTokenLink");

    }
    
    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getDownloadLink() {
        return this.downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public String getAcsTokenLink() {
        return this.acsTokenLink;
    }

    public void setAcsTokenLink(String acsTokenLink) {
        this.acsTokenLink = acsTokenLink;
    }


    
}
