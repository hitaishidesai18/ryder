package com.example.ryderr.ui.main.driver.driverHome.request_Driver;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ryderr.R;

public class RequestDriverViewHolder extends RecyclerView.ViewHolder{

    TextView from;
    TextView to;
    TextView timeText;
    TextView fare_text;
    TextView request_name;
    Button acceptButton;
    View view;

    public RequestDriverViewHolder(@NonNull View itemView) {
        super(itemView);

        from = itemView.findViewById(R.id.request_driver_from_text);
        to = itemView.findViewById(R.id.request_driver_to_text);
        timeText = itemView.findViewById(R.id.request_driver_text_time);
        fare_text = itemView.findViewById(R.id.request_driver_fare);
        request_name = itemView.findViewById(R.id.request_driver_name);
        acceptButton = itemView.findViewById(R.id.request_accept_button);
        view = itemView;
    }
}
