package com.example.ryderr.ui.main.cabs.request_Driver;

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
import com.example.ryderr.models.RequestCab;
import com.example.ryderr.models.RequestDriver;
import com.example.ryderr.ui.main.cabs.request.RequestCabListAdapter;

import java.util.ArrayList;

public class RequestDriverFragment extends Fragment {

    private RequestDriverViewModel mViewModel;
    RecyclerView recyclerView;
    ArrayList<RequestDriver> list;

    public static RequestDriverFragment newInstance() {
        return new RequestDriverFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_request_driver, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(RequestDriverViewModel.class);
        // TODO: Use the ViewModel

        recyclerView = getView().findViewById(R.id.request_driver_recycler);
        list = mViewModel.populate();
        RequestDriverListAdapter adapter = new RequestDriverListAdapter(list, getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(
                new LinearLayoutManager(getContext()));
    }

}