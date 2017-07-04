package com.example.android.miwok;

/**
 * Created by adama on 04.07.2017.
 */

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;

    public Word (String mMiwokTranslation, String mDefaultTranslation){
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public void setmMiwokTranslation(String mMiwokTranslation){
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public void setmDefaultTranslation(String mDefaultTranslation){
        this.mDefaultTranslation = mDefaultTranslation;
    }
}
