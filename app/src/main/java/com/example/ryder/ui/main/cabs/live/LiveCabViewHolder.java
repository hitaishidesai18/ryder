package com.example.ryder.ui.main.cabs;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ryder.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class LiveCabViewHolder extends RecyclerView.ViewHolder {

    TextView from;
    TextView to;
    TextView timeText;
    TextView driver_name;
    TextView vehicle;
    TextView fare_text;
    CircleImageView driverAvatar;
    Button joinButton;
    View view;


    public LiveCabViewHolder(View itemView) {
        super(itemView);

        from = itemView.findViewById(R.id.from_text);
        to = itemView.findViewById(R.id.to_text);
        timeText = itemView.findViewById(R.id.time_text);
        driver_name = itemView.findViewById(R.id.driver_name_text);
        vehicle = itemView.findViewById(R.id.vehicle_number_text);
        fare_text = itemView.findViewById(R.id.fare_text);
        driverAvatar = itemView.findViewById(R.id.circular_avatar);
        joinButton = itemView.findViewById(R.id.join_button);
        view = itemView;

    }
}