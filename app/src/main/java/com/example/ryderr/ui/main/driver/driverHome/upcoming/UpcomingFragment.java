package com.example.ryderr.ui.main.driver.driverHome.upcoming;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ryderr.R;
import com.example.ryderr.models.Upcoming;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class UpcomingFragment extends Fragment {

    private UpcomingViewModel mViewModel;
    RecyclerView recyclerView;
    ArrayList<Upcoming> list;


    public static UpcomingFragment newInstance() {
        return new UpcomingFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        mViewModel = new UpcomingViewModel();
        return inflater.inflate(R.layout.fragment_upcoming, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = getView().findViewById(R.id.upcoming_recycler);
        list = mViewModel.populate();
        Observer<ArrayList<Upcoming>> observer = new Observer<ArrayList<Upcoming>>() {
            @Override
            public void onChanged(ArrayList<Upcoming> cabs) {
                list = cabs;
                UpcomingListAdapter adapter = new UpcomingListAdapter(list, getContext());
                recyclerView.setAdapter(adapter);

            }
        };

        recyclerView.setLayoutManager(
                new LinearLayoutManager(getContext()));
    }



}