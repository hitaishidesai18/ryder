package com.example.ryderr.ui.main.cabs.request;

import com.example.ryderr.models.RequestCab;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class RequestViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    public ArrayList<RequestCab> populate(){

        ArrayList<RequestCab>  list = new ArrayList<>();
        list.add(new RequestCab());
        list.add(new RequestCab());
        list.add(new RequestCab());
        list.add(new RequestCab());
        list.add(new RequestCab());
        list.add(new RequestCab());
        list.add(new RequestCab());

        return list;
    }
}