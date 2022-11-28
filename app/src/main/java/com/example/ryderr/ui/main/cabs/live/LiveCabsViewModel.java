package com.example.ryderr.ui.main.cabs.live;

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