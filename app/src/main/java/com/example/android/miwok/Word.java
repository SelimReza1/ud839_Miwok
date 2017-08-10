package com.example.android.miwok;

/**
 * Created by Selim Reza on 8/9/2017.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiowkTranslation;


    public Word(String defaultTranslation,String miowkTranslation){
    mDefaultTranslation = defaultTranslation;
        mMiowkTranslation = miowkTranslation;
    }

    public String getDefaultTransltion(){
        return mDefaultTranslation;
    }
    public String getMiowkTranslation(){
        return mMiowkTranslation;
    }
}
