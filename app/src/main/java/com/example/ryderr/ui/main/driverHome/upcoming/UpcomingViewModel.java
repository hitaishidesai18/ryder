package com.example.ryderr.ui.main.driverHome.upcoming;

import com.example.ryderr.models.Upcoming;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UpcomingViewModel extends ViewModel {
    public MutableLiveData<ArrayList<Upcoming>> upcomingCabsList;
    private DatabaseReference mDatabase;
    FirebaseFirestore db = FirebaseFirestore.getInstance();





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