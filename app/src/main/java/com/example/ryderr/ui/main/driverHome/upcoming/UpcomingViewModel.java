package com.example.ryderr.ui.main.driverHome.upcoming;

import androidx.lifecycle.ViewModel;

import com.example.ryderr.models.Upcoming;

import java.util.ArrayList;

public class UpcomingViewModel extends ViewModel {
    // TODO: Implement the ViewModel




    public ArrayList<Upcoming> populate(){

        ArrayList<Upcoming>  list = new ArrayList<>();
        list.add(new Upcoming());
        list.add(new Upcoming());
        list.add(new Upcoming());
        list.add(new Upcoming());
        list.add(new Upcoming());
        list.add(new Upcoming());
        list.add(new Upcoming());

        return list;
    }

}