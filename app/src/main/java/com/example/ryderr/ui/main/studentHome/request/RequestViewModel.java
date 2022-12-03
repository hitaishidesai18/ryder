package com.example.ryderr.ui.main.studentHome.request;

import com.example.ryderr.models.Request;

import java.util.ArrayList;

import androidx.lifecycle.ViewModel;

public class RequestViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    public ArrayList<Request> populate(){

        ArrayList<Request>  list = new ArrayList<>();
        list.add(new Request());
        list.add(new Request());
        list.add(new Request());


        return list;
    }
}