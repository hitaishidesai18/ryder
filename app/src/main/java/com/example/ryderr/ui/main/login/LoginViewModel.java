package com.example.ryderr.ui.main.login;

import android.util.Log;

import com.example.ryderr.models.Cab;
import com.example.ryderr.models.Student;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Arrays;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;

public class LoginViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private FirebaseAuth mAuth;
    private DatabaseReference mDatabase;


    public boolean isUserSignedIn() {
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser != null) {
            return true;
        }
        return false;
    }
    public void signin(){

    }
    public void addUser(FirebaseUser firebaseUser){
        Student student = new Student(firebaseUser.getUid(), firebaseUser.getDisplayName(),
                firebaseUser.getEmail());
        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child("students").child(student.getUid()).setValue(student);


    }
//    public void addCab(){
//        final long[] cabId = {0};
//        mDatabase = FirebaseDatabase.getInstance().getReference();
//        Cab cab1 = new Cab("3",null,5,0,500,false,"Yoyo", "TN08XX9999", "BITS", "Parade Ground","7:00pm");
//        mDatabase.child("cabs").child("3").setValue(cab1);
//    }
    public void updateStatus(FirebaseUser firebaseUser){

    }
}