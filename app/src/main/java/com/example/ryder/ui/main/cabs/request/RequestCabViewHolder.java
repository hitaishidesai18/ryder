package com.example.ryder.ui.main.cabs.request;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ryder.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class RequestCabViewHolder extends RecyclerView.ViewHolder{



    TextView from;
    TextView to;
    TextView timeText;
    TextView fare_text;
    TextView request_name;
    Button joinButton;
    View view;


    public RequestCabViewHolder(View itemView) {
        super(itemView);

        from = itemView.findViewById(R.id.request_from_text);
        to = itemView.findViewById(R.id.request_to_text);
        timeText = itemView.findViewById(R.id.request_time_text);
        fare_text = itemView.findViewById(R.id.fare_text);
        request_name = itemView.findViewById(R.id.request_text);
        joinButton = itemView.findViewById(R.id.request_join_button);
        view = itemView;
    }
}
