package com.example.ryderr.ui.main.cabs.live;

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

import java.util.ArrayList;

public class LiveCabsFragment extends Fragment {

    private LiveCabsViewModel mViewModel;
    RecyclerView recyclerView;
    ArrayList<LiveCab> list;

    public static LiveCabsFragment newInstance() {
        return new LiveCabsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_live_cabs, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(LiveCabsViewModel.class);
        // TODO: Use the ViewModel

        recyclerView = getView().findViewById(R.id.recycler_view);
        list = mViewModel.populate();
        LiveCabListAdapter adapter = new LiveCabListAdapter(list, getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(
                new LinearLayoutManager(getContext()));
    }

}