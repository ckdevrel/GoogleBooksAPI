package com.takeoffandroid.googlebooksapi.models.books;

import org.json.*;
import java.util.ArrayList;

public class AbstractBooks {
	
    private String kind;
    private double totalItems;
    private ArrayList<Items> items;
    
    
	public AbstractBooks () {
		
	}	
        
    public AbstractBooks (JSONObject json) {
    
        this.kind = json.optString("kind");
        this.totalItems = json.optDouble("totalItems");

        this.items = new ArrayList<Items>();
        JSONArray arrayItems = json.optJSONArray("items");
        if (null != arrayItems) {
            int itemsLength = arrayItems.length();
            for (int i = 0; i < itemsLength; i++) {
                JSONObject item = arrayItems.optJSONObject(i);
                if (null != item) {
                    this.items.add(new Items(item));
                }
            }
        }
        else {
            JSONObject item = json.optJSONObject("items");
            if (null != item) {
                this.items.add(new Items(item));
            }
        }


    }
    
    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public double getTotalItems() {
        return this.totalItems;
    }

    public void setTotalItems(double totalItems) {
        this.totalItems = totalItems;
    }

    public ArrayList<Items> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }


    
}
