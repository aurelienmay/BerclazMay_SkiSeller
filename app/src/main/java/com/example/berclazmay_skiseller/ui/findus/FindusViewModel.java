package com.example.berclazmay_skiseller.ui.findus;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FindusViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FindusViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is findus fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}