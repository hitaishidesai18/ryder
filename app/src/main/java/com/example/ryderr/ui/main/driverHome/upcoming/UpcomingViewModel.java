package com.example.ryderr.ui.main.driverHome.upcoming;

import com.example.ryderr.models.Upcoming;

import java.util.ArrayList;

import androidx.lifecycle.ViewModel;

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