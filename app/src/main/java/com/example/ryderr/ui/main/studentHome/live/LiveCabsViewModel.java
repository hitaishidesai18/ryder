package com.example.ryderr.ui.main.studentHome.live;

import com.example.ryderr.models.LiveCab;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class LiveCabsViewModel extends ViewModel {
    // TODO: Implement the ViewModel


    public ArrayList<LiveCab> populate(){

        ArrayList<LiveCab>  list = new ArrayList<>();
        list.add(new LiveCab());
        list.add(new LiveCab());
        list.add(new LiveCab());
        list.add(new LiveCab());
        list.add(new LiveCab());
        list.add(new LiveCab());
        list.add(new LiveCab());

        return list;
    }


}