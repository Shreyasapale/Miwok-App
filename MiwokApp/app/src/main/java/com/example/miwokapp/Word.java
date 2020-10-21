package com.example.miwokapp;

public class Word {
    private String mDefaultTranslation ;
    private String  mMiwokTranslation ;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1 ;


    public Word (String defaultTranslation, String miwokTramslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTramslation;
    }

    public Word (String defaultTranslation, String miwokTramslation,int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTramslation;
        mImageResourceId = imageResourceId;
    }

    public String getDefaultTranslation () {
        return mDefaultTranslation;
    }
    public String getMiwokTranslation (){
        return  mMiwokTranslation;
    }
    public int getImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_PROVIDED;
    }
}
