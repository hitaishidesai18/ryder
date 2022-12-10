package com.example.ryderr.ui.main.driverHome.driverLiveCabDetails;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.ryderr.R;
import com.example.ryderr.models.LiveCab;
import com.google.android.material.button.MaterialButton;

public class DriverLiveCabDetailsFragment extends Fragment {
    private LiveCab liveCabOb;
    private TextView fare, from, to, vehicle, vehicleNo, time, capacity, driver;
    private MaterialButton endBtn;
    private ListView ridersList;
    public DriverLiveCabDetailsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        liveCabOb = new LiveCab();
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_driver_live_cab_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        fare = (TextView)view.findViewById(R.id.estimatedFare_livecabdetails);
        from = (TextView)view.findViewById(R.id.from_livecabdetails);
        to = (TextView)view.findViewById(R.id.to_livecabdetails);
        vehicle = (TextView)view.findViewById(R.id.vehicleType_livecabdetails);
        vehicleNo = (TextView)view.findViewById(R.id.vehicleNumber_livecabdetails);
        time = (TextView)view.findViewById(R.id.time_livecabdetails);
        capacity = (TextView)view.findViewById(R.id.capacity_livecabdetails);
        driver = (TextView)view.findViewById(R.id.driver_livecabdetails);
        endBtn = (MaterialButton)view.findViewById(R.id.endButton);
        from.setText(liveCabOb.getFrom_location());
        fare.setText(liveCabOb.getFare());
        to.setText(liveCabOb.getTo_location());
        vehicle.setText(liveCabOb.getVehicle_type());
        vehicleNo.setText(liveCabOb.getVehicle_number());
        time.setText(liveCabOb.getDeparture_time());
        capacity.setText(liveCabOb.getCapacity());
        driver.setText(liveCabOb.getDriver_name());

        ridersList = (ListView)view.findViewById(R.id.ridersList_livecabdetails);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, liveCabOb.getDisplay());
        ridersList.setAdapter(arrayAdapter);
        endBtn.setOnClickListener(view1 -> {

        });
        super.onViewCreated(view, savedInstanceState);
    }
}