package com.example.miwokapp;

public class Word {
    private String mDefaultTranslation ;
    private String  mMiwokTranslation ;
    private int mAudioResourceId ;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1 ;


    public Word (String defaultTranslation, String miwokTramslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTramslation;
        mAudioResourceId = audioResourceId;
    }

    public Word (String defaultTranslation, String miwokTramslation,int imageResourceId,int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTramslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
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
