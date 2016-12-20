package com.takeoffandroid.googlebooksapi.models.books;

import org.json.*;
import java.util.ArrayList;

public class VolumeInfo {
	
    private double ratingsCount;
    private double averageRating;
    private String publisher;
    private ArrayList<IndustryIdentifiers> industryIdentifiers;
    private ReadingModes readingModes;
    private String title;
    private String language;
    private String infoLink;
    private ImageLinks imageLinks;
    private boolean allowAnonLogging;
    private String printType;
    private ArrayList<String> authors;
    private double pageCount;
    private String subtitle;
    private String maturityRating;
    private String contentVersion;
    private String publishedDate;
    private String previewLink;
    private String canonicalVolumeLink;
    private ArrayList<String> categories;
    private String description;
    
    
	public VolumeInfo () {
		
	}	
        
    public VolumeInfo (JSONObject json) {
    
        this.ratingsCount = json.optDouble("ratingsCount");
        this.averageRating = json.optDouble("averageRating");
        this.publisher = json.optString("publisher");

        this.industryIdentifiers = new ArrayList<IndustryIdentifiers>();
        JSONArray arrayIndustryIdentifiers = json.optJSONArray("industryIdentifiers");
        if (null != arrayIndustryIdentifiers) {
            int industryIdentifiersLength = arrayIndustryIdentifiers.length();
            for (int i = 0; i < industryIdentifiersLength; i++) {
                JSONObject item = arrayIndustryIdentifiers.optJSONObject(i);
                if (null != item) {
                    this.industryIdentifiers.add(new IndustryIdentifiers(item));
                }
            }
        }
        else {
            JSONObject item = json.optJSONObject("industryIdentifiers");
            if (null != item) {
                this.industryIdentifiers.add(new IndustryIdentifiers(item));
            }
        }

        this.readingModes = new ReadingModes(json.optJSONObject("readingModes"));
        this.title = json.optString("title");
        this.language = json.optString("language");
        this.infoLink = json.optString("infoLink");
        this.imageLinks = new ImageLinks(json.optJSONObject("imageLinks"));
        this.allowAnonLogging = json.optBoolean("allowAnonLogging");
        this.printType = json.optString("printType");

        this.authors = new ArrayList<String>();
        JSONArray arrayAuthors = json.optJSONArray("authors");
        if (null != arrayAuthors) {
            int authorsLength = arrayAuthors.length();
            for (int i = 0; i < authorsLength; i++) {
                String item = arrayAuthors.optString(i);
                if (null != item) {
                    this.authors.add(item);
                }
            }
        }
        else {
            String item = json.optString("authors");
            if (null != item) {
                this.authors.add(item);
            }
        }

        this.pageCount = json.optDouble("pageCount");
        this.subtitle = json.optString("subtitle");
        this.maturityRating = json.optString("maturityRating");
        this.contentVersion = json.optString("contentVersion");
        this.publishedDate = json.optString("publishedDate");
        this.previewLink = json.optString("previewLink");
        this.canonicalVolumeLink = json.optString("canonicalVolumeLink");

        this.categories = new ArrayList<String>();
        JSONArray arrayCategories = json.optJSONArray("categories");
        if (null != arrayCategories) {
            int categoriesLength = arrayCategories.length();
            for (int i = 0; i < categoriesLength; i++) {
                String item = arrayCategories.optString(i);
                if (null != item) {
                    this.categories.add(item);
                }
            }
        }
        else {
            String item = json.optString("categories");
            if (null != item) {
                this.categories.add(item);
            }
        }

        this.description = json.optString("description");

    }
    
    public double getRatingsCount() {
        return this.ratingsCount;
    }

    public void setRatingsCount(double ratingsCount) {
        this.ratingsCount = ratingsCount;
    }

    public double getAverageRating() {
        return this.averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public ArrayList<IndustryIdentifiers> getIndustryIdentifiers() {
        return this.industryIdentifiers;
    }

    public void setIndustryIdentifiers(ArrayList<IndustryIdentifiers> industryIdentifiers) {
        this.industryIdentifiers = industryIdentifiers;
    }

    public ReadingModes getReadingModes() {
        return this.readingModes;
    }

    public void setReadingModes(ReadingModes readingModes) {
        this.readingModes = readingModes;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getInfoLink() {
        return this.infoLink;
    }

    public void setInfoLink(String infoLink) {
        this.infoLink = infoLink;
    }

    public ImageLinks getImageLinks() {
        return this.imageLinks;
    }

    public void setImageLinks(ImageLinks imageLinks) {
        this.imageLinks = imageLinks;
    }

    public boolean getAllowAnonLogging() {
        return this.allowAnonLogging;
    }

    public void setAllowAnonLogging(boolean allowAnonLogging) {
        this.allowAnonLogging = allowAnonLogging;
    }

    public String getPrintType() {
        return this.printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public ArrayList<String> getAuthors() {
        return this.authors;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

    public double getPageCount() {
        return this.pageCount;
    }

    public void setPageCount(double pageCount) {
        this.pageCount = pageCount;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getMaturityRating() {
        return this.maturityRating;
    }

    public void setMaturityRating(String maturityRating) {
        this.maturityRating = maturityRating;
    }

    public String getContentVersion() {
        return this.contentVersion;
    }

    public void setContentVersion(String contentVersion) {
        this.contentVersion = contentVersion;
    }

    public String getPublishedDate() {
        return this.publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getPreviewLink() {
        return this.previewLink;
    }

    public void setPreviewLink(String previewLink) {
        this.previewLink = previewLink;
    }

    public String getCanonicalVolumeLink() {
        return this.canonicalVolumeLink;
    }

    public void setCanonicalVolumeLink(String canonicalVolumeLink) {
        this.canonicalVolumeLink = canonicalVolumeLink;
    }

    public ArrayList<String> getCategories() {
        return this.categories;
    }

    public void setCategories(ArrayList<String> categories) {
        this.categories = categories;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    
}
