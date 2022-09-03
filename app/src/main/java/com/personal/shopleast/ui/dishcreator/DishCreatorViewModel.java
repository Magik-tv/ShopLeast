package com.personal.shopleast.ui.dishcreator;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DishCreatorViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DishCreatorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the dish creator fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}