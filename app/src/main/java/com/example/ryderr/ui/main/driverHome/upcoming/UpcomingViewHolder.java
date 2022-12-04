package com.example.ryderr.ui.main.driverHome.upcoming;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ryderr.R;

public class UpcomingViewHolder extends RecyclerView.ViewHolder {

    TextView from;
    TextView to;
    TextView timeText;
    TextView fare_text;
    Button start, chat, cancel;
    View view;


    public UpcomingViewHolder(View itemView) {
        super(itemView);

        from = itemView.findViewById(R.id.request_from_text);
        to = itemView.findViewById(R.id.request_driver_to_text);
        timeText = itemView.findViewById(R.id.request_driver_text_time);
        fare_text = itemView.findViewById(R.id.upcoming_fare_text);
        start = itemView.findViewById(R.id.start_button);
        chat = itemView.findViewById(R.id.chat_button);
        cancel = itemView.findViewById(R.id.cancel_button);
        view = itemView;

    }
}