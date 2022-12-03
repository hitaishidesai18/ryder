package com.example.ryderr.ui.main.cabs.request;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.ryderr.R;

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
        to = itemView.findViewById(R.id.request__to_text);
        timeText = itemView.findViewById(R.id.request__text_time);
        fare_text = itemView.findViewById(R.id.fare_text);
        request_name = itemView.findViewById(R.id.request__name);
        joinButton = itemView.findViewById(R.id.request_join_button);
        view = itemView;
    }
}
