package com.example.firebasestorageimage;

import com.google.firebase.database.Exclude;

public class UploadModel {
    private String mKey;
    private String mName;
    private String mImageUrl;

    public UploadModel() {
        //  empty constructor needed
    }

    public UploadModel(String name, String imageUrl) {
//        if (name.trim().equals("")) {
//            name = "No name";
//        }

        this.mName = name;
        this.mImageUrl = imageUrl;
    }

    @Exclude
    public String getKey() {
        return mKey;
    }

    @Exclude
    public void setKey(String mKey) {
        this.mKey = mKey;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.mImageUrl = imageUrl;
    }
}
