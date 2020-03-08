package com.example.berclazmay_skiseller.ui.settings;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SettingsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SettingsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Version 1.0\n" + "©Ski seller SA - 2020");
    }

    public LiveData<String> getText() {
        return mText;
    }
}