package com.example.ryderr.ui.main.studentHome.live;

import android.util.Log;

import com.example.ryderr.models.Cab;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LiveCabsViewModel extends ViewModel {
    private static final String TAG = "Live cabs view model";
    // TODO: Implement the ViewModel
    public MutableLiveData<ArrayList<Cab>> studentLiveCabs;
    private DatabaseReference mDatabase;

    public MutableLiveData<ArrayList<Cab>> getStudentLiveCabs() {

        if(studentLiveCabs==null){
            studentLiveCabs = new MutableLiveData<>();
        }
        mDatabase = FirebaseDatabase.getInstance().getReference();



        DatabaseReference liveCabRef = mDatabase.child("cabs");
       // Query queryRef = liveCabRef.orderByChild("live").equalTo(true);
        liveCabRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                GenericTypeIndicator<HashMap<String,Cab>> t=  new GenericTypeIndicator<HashMap<String,Cab>>() { };

                HashMap<String,Cab> hashMap= (HashMap<String,Cab>)dataSnapshot.getValue(t);

                ArrayList<Cab> cabsList;
                if(hashMap!=null) {
                    cabsList = new ArrayList<Cab>(hashMap.values());


                }else{
                    cabsList = new ArrayList<Cab>();

                }
//                GenericTypeIndicator<HashMap<String,Cab>> t=  new GenericTypeIndicator<HashMap<String,Cab>>() { };
//                ArrayList<Cab> cabsList = dataSnapshot.getValue(t);
            studentLiveCabs.setValue(cabsList);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

//        ChildEventListener childEventListener = new ChildEventListener() {
//            @Override
//            public void onChildAdded(DataSnapshot dataSnapshot, String previousChildName) {
//                Log.d(TAG, "onChildAdded:" + dataSnapshot.getKey());
//
//                Cab cab = dataSnapshot.getValue(Cab.class);
//                ArrayList<Cab> cabs = studentLiveCabs.getValue();
//                cabs.add(cab);
//                studentLiveCabs.setValue(cabs);
//
//            }
//
//            @Override
//            public void onChildChanged(DataSnapshot dataSnapshot, String previousChildName) {
//                Log.d(TAG, "onChildChanged:" + dataSnapshot.getKey());
//
//                // A comment has changed, use the key to determine if we are displaying this
//                // comment and if so displayed the changed comment.
//                Cab cab = dataSnapshot.getValue(Cab.class);
//                String cabKey = dataSnapshot.getKey();
//
//            }
//
//            @Override
//            public void onChildRemoved(DataSnapshot dataSnapshot) {
//                Log.d(TAG, "onChildRemoved:" + dataSnapshot.getKey());
//
//                // A comment has changed, use the key to determine if we are displaying this
//                // comment and if so remove it.
//                String cabKey = dataSnapshot.getKey();
//
//                // ...
//            }
//
//            @Override
//            public void onChildMoved(@NonNull DataSnapshot snapshot,
//                    @Nullable String previousChildName) {
//
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//                Log.w(TAG, "postComments:onCancelled", databaseError.toException());
//            }
//        };
//        mDatabase.addChildEventListener(childEventListener);

        return studentLiveCabs;
    }

    public ArrayList<Cab> populate(){

        ArrayList<Cab>  list = new ArrayList<>();
        list.add(new Cab());
        list.add(new Cab());
        list.add(new Cab());
        list.add(new Cab());
        list.add(new Cab());
        list.add(new Cab());
        list.add(new Cab());

        return list;
    }


}