package com.example.ryderr.ui.main.cabs.upcoming;

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
import com.example.ryderr.models.LiveCab;
import com.example.ryderr.models.Upcoming;
import com.example.ryderr.ui.main.cabs.live.LiveCabListAdapter;

import java.util.ArrayList;

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
        return inflater.inflate(R.layout.fragment_upcoming, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(UpcomingViewModel.class);
        // TODO: Use the ViewModel

        recyclerView = getView().findViewById(R.id.upcoming_recycler);
        list = mViewModel.populate();
        UpcomingListAdapter adapter = new UpcomingListAdapter(list, getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(
                new LinearLayoutManager(getContext()));
    }

}