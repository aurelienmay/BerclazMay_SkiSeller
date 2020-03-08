package com.example.berclazmay_skiseller.ui.findUs;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FindUsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FindUsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is find us fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}