package com.takeoffandroid.googlebooksapi.models.books;

import org.json.*;


public class ImageLinks {
	
    private String smallThumbnail;
    private String thumbnail;
    
    
	public ImageLinks () {
		
	}	
        
    public ImageLinks (JSONObject json) {
    
        this.smallThumbnail = json.optString("smallThumbnail");
        this.thumbnail = json.optString("thumbnail");

    }
    
    public String getSmallThumbnail() {
        return this.smallThumbnail;
    }

    public void setSmallThumbnail(String smallThumbnail) {
        this.smallThumbnail = smallThumbnail;
    }

    public String getThumbnail() {
        return this.thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }


    
}
