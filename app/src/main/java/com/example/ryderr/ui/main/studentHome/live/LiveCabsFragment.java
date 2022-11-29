package com.example.ryderr.ui.main.studentHome.live;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ryderr.R;
import com.example.ryderr.models.Cab;

import java.util.ArrayList;

public class LiveCabsFragment extends Fragment {

    private LiveCabsViewModel mViewModel;
    RecyclerView recyclerView;
    ArrayList<Cab> list;

    public static LiveCabsFragment newInstance() {
        return new LiveCabsFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = new LiveCabsViewModel();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        mViewModel.getStudentLiveCabs();
        return inflater.inflate(R.layout.fragment_live_cabs, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(LiveCabsViewModel.class);
        // TODO: Use the ViewModel

        recyclerView = getView().findViewById(R.id.recycler_view);
        list = mViewModel.populate();
        LiveCabListAdapter adapter = new LiveCabListAdapter(list, getContext());
        Observer<ArrayList<Cab>> observer = new Observer<ArrayList<Cab>>() {
            @Override
            public void onChanged(ArrayList<Cab> cabs) {
                adapter.list = cabs;
                recyclerView.setAdapter(adapter);
                recyclerView.setLayoutManager(
                        new LinearLayoutManager(getContext()));
            }
        };

        mViewModel.getStudentLiveCabs().observe(getViewLifecycleOwner(), observer);

    }



}