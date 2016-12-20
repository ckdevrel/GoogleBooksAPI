package com.takeoffandroid.googlebooksapi.models.books;

import org.json.*;


public class AccessInfo {
	
    private String viewability;
    private boolean publicDomain;
    private String country;
    private String accessViewStatus;
    private boolean quoteSharingAllowed;
    private String webReaderLink;
    private String textToSpeechPermission;
    private Pdf pdf;
    private boolean embeddable;
    private Epub epub;
    
    
	public AccessInfo () {
		
	}	
        
    public AccessInfo (JSONObject json) {
    
        this.viewability = json.optString("viewability");
        this.publicDomain = json.optBoolean("publicDomain");
        this.country = json.optString("country");
        this.accessViewStatus = json.optString("accessViewStatus");
        this.quoteSharingAllowed = json.optBoolean("quoteSharingAllowed");
        this.webReaderLink = json.optString("webReaderLink");
        this.textToSpeechPermission = json.optString("textToSpeechPermission");
        this.pdf = new Pdf(json.optJSONObject("pdf"));
        this.embeddable = json.optBoolean("embeddable");
        this.epub = new Epub(json.optJSONObject("epub"));

    }
    
    public String getViewability() {
        return this.viewability;
    }

    public void setViewability(String viewability) {
        this.viewability = viewability;
    }

    public boolean getPublicDomain() {
        return this.publicDomain;
    }

    public void setPublicDomain(boolean publicDomain) {
        this.publicDomain = publicDomain;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAccessViewStatus() {
        return this.accessViewStatus;
    }

    public void setAccessViewStatus(String accessViewStatus) {
        this.accessViewStatus = accessViewStatus;
    }

    public boolean getQuoteSharingAllowed() {
        return this.quoteSharingAllowed;
    }

    public void setQuoteSharingAllowed(boolean quoteSharingAllowed) {
        this.quoteSharingAllowed = quoteSharingAllowed;
    }

    public String getWebReaderLink() {
        return this.webReaderLink;
    }

    public void setWebReaderLink(String webReaderLink) {
        this.webReaderLink = webReaderLink;
    }

    public String getTextToSpeechPermission() {
        return this.textToSpeechPermission;
    }

    public void setTextToSpeechPermission(String textToSpeechPermission) {
        this.textToSpeechPermission = textToSpeechPermission;
    }

    public Pdf getPdf() {
        return this.pdf;
    }

    public void setPdf(Pdf pdf) {
        this.pdf = pdf;
    }

    public boolean getEmbeddable() {
        return this.embeddable;
    }

    public void setEmbeddable(boolean embeddable) {
        this.embeddable = embeddable;
    }

    public Epub getEpub() {
        return this.epub;
    }

    public void setEpub(Epub epub) {
        this.epub = epub;
    }


    
}
