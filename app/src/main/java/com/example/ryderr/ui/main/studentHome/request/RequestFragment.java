package com.example.ryderr.ui.main.studentHome.request;

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


import java.util.ArrayList;

public class RequestFragment extends Fragment {

    private RequestViewModel mViewModel;
    RecyclerView recyclerView;
    ArrayList<RequestCab> list;

    public static RequestFragment newInstance() {
        return new RequestFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_request, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(RequestViewModel.class);
        // TODO: Use the ViewModel

        recyclerView = getView().findViewById(R.id.request_recycler);
        list = mViewModel.populate();
        RequestCabListAdapter adapter = new RequestCabListAdapter(list, getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(
                new LinearLayoutManager(getContext()));
    }

}