package com.example.ryderr.ui.main.driver.driverHome.request_Driver;

import androidx.lifecycle.ViewModel;

import com.example.ryderr.models.RequestDriver;

import java.util.ArrayList;

public class RequestDriverViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    public ArrayList<RequestDriver> populate(){

        ArrayList<RequestDriver>  list = new ArrayList<>();
        list.add(new RequestDriver());
        list.add(new RequestDriver());
        list.add(new RequestDriver());
        list.add(new RequestDriver());
        list.add(new RequestDriver());
        list.add(new RequestDriver());
        list.add(new RequestDriver());

        return list;
    }
}