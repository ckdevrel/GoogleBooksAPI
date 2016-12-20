package com.takeoffandroid.googlebooksapi.models.books;

import org.json.*;


public class Items {
	
    private String selfLink;
    private String etag;
    private String id;
    private AccessInfo accessInfo;
    private SaleInfo saleInfo;
    private SearchInfo searchInfo;
    private String kind;
    private VolumeInfo volumeInfo;
    
    
	public Items () {
		
	}	
        
    public Items (JSONObject json) {
    
        this.selfLink = json.optString("selfLink");
        this.etag = json.optString("etag");
        this.id = json.optString("id");
        this.accessInfo = new AccessInfo(json.optJSONObject("accessInfo"));
        this.saleInfo = new SaleInfo(json.optJSONObject("saleInfo"));
        this.searchInfo = new SearchInfo(json.optJSONObject("searchInfo"));
        this.kind = json.optString("kind");
        this.volumeInfo = new VolumeInfo(json.optJSONObject("volumeInfo"));

    }
    
    public String getSelfLink() {
        return this.selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    public String getEtag() {
        return this.etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AccessInfo getAccessInfo() {
        return this.accessInfo;
    }

    public void setAccessInfo(AccessInfo accessInfo) {
        this.accessInfo = accessInfo;
    }

    public SaleInfo getSaleInfo() {
        return this.saleInfo;
    }

    public void setSaleInfo(SaleInfo saleInfo) {
        this.saleInfo = saleInfo;
    }

    public SearchInfo getSearchInfo() {
        return this.searchInfo;
    }

    public void setSearchInfo(SearchInfo searchInfo) {
        this.searchInfo = searchInfo;
    }

    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public VolumeInfo getVolumeInfo() {
        return this.volumeInfo;
    }

    public void setVolumeInfo(VolumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }


    
}
