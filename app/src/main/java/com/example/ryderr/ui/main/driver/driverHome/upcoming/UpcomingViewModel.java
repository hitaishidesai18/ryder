package com.example.ryderr.ui.main.driver.driverHome.upcoming;

import android.util.Log;

import com.example.ryderr.models.LiveCab;
import com.example.ryderr.models.Upcoming;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UpcomingViewModel extends ViewModel {
    private static final String TAG = "Upcoming viewmodel";
    public MutableLiveData<ArrayList<LiveCab>> driverCabslist;
    private DatabaseReference mDatabase;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    public MutableLiveData<ArrayList<LiveCab>> getDriverCabs(){
        if(driverCabslist==null){
            driverCabslist = new MutableLiveData<>();
        }
        mDatabase = FirebaseDatabase.getInstance().getReference();


        String driverId = FirebaseAuth.getInstance().getUid();
        ArrayList<LiveCab> list = new ArrayList<>();
        db.collection("cabs")
                .whereEqualTo("live", true)
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Log.d(TAG, document.getId() + " => " + document.getData());
                                LiveCab liveCab = document.toObject(LiveCab.class);
                                if(liveCab.getDriver_id() == driverId) {
                                    list.add(liveCab);
                                }
                            }
                        } else {
                            Log.d(TAG, "Error getting documents: ", task.getException());
                        }
                    }
                });
        driverCabslist.setValue(list);
        return driverCabslist;
    }




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