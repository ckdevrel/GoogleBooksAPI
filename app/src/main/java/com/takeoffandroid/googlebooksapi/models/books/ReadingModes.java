package com.takeoffandroid.googlebooksapi.models.books;

import org.json.*;


public class ReadingModes {
	
    private boolean image;
    private boolean text;
    
    
	public ReadingModes () {
		
	}	
        
    public ReadingModes (JSONObject json) {
    
        this.image = json.optBoolean("image");
        this.text = json.optBoolean("text");

    }
    
    public boolean getImage() {
        return this.image;
    }

    public void setImage(boolean image) {
        this.image = image;
    }

    public boolean getText() {
        return this.text;
    }

    public void setText(boolean text) {
        this.text = text;
    }


    
}
