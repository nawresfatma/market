package com.example.market;

public class StoreItem {
    private int storeImage;
  private String storeName;
  private String storeDescription;

    public StoreItem(int storeImage, String storeName, String storeDescription) {
        this.storeImage = storeImage;
        this.storeName = storeName;
        this.storeDescription = storeDescription;
    }

    public int getStoreImage() {
        return storeImage;
    }

    public void setStoreImage(int storeImage) {
        this.storeImage = storeImage;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreDescription() {
        return storeDescription;
    }

    public void setStoreDescription(String storeDescription) {
        this.storeDescription = storeDescription;
    }
}
