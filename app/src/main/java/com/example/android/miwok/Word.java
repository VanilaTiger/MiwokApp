package com.example.android.miwok;

/**
 * Created by adama on 04.07.2017.
 */

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word ( String mDefaultTranslation,String mMiwokTranslation){
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public Word ( String mDefaultTranslation,String mMiwokTranslation, int mImageResourceID){
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mImageResourceID = mImageResourceID;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public int getmImageResourceID(){ return mImageResourceID;}

    public void setmMiwokTranslation(String mMiwokTranslation){
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public void setmDefaultTranslation(String mDefaultTranslation){
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public void setmImageResourceID(int mImageResourceID){
        this.mImageResourceID = mImageResourceID;
    }

    public boolean hasImage(){
        return mImageResourceID !=NO_IMAGE_PROVIDED;
    }
}
