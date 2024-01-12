package com.example.firebasestorageimage;

public class UploadModel {
    private String mName;
    private String mImageUrl;

    public UploadModel() {
        //  empty constructor needed
    }

    public UploadModel(String name, String imageUrl) {
        if (name.trim().equals("")) {
            name = "No name";
        }

        mName = name;
        mImageUrl = imageUrl;
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
